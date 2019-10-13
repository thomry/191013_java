import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class LottoExam {

	public static void main(String[] args) {
		/**
		 * 1. 로또프로그램 만들기
		 * 2. 로또는 6개 숫자 + 보너스 번호 1
		 * 3. 사용자가 로또를 입력해야함
		 * 4. 로또는 중복되는 수가 없음. - 중복제거 필요
		 * 5. 숫자의 범위는 1~45 -> 랜덤함수 함수가 필요
		 * 6. 사용자 입력과 랜덤 로또 비교할 것
		 * 7. 비교 후 등수 출력
		 */
		
		int[] userLotto = new int[6]; // 사용자 로또
		int[] lotto     = new int[6]; // 랜덤 로또
		
		Scanner scan = new Scanner(System.in); // 키보드 임력
		Random ran   = new Random();           // 랜덤 값 가져오기위해 랜덤함수
		
		int index     = 0; // 배열 index 값
		int tempValue = 0; // 중복처리위한 임시변수
		int bonusNum  = 0; // 보너스 번호 입력변수
		
		boolean isDuplicated = false; // 중복여부체크할 boolean
		
		/*---------------------------컴퓨터의 로또------------------------------------*/
		while (index <= 6) {
			tempValue = ran.nextInt(45)+1; // 1~45사이 숫자중 하나 출력.
			
			if (index == 0) { // 처음 수는 중복 확인 필요없음
				lotto[index++] = tempValue;
				// isDuplicated = true; // 아래의 else문 안타게 하기 위해서
				continue; // 더 진행필요없어서 여기에서 끝남
			} else {          // 두번째 수 부터 중복확인
				for (int i =0; i < index; i++) {
					if (lotto[i] == tempValue) {
						isDuplicated = true;
						break;
					}
				}
				
				if (isDuplicated) {
					isDuplicated = false;  //다음번 비교때문에 초기화
				}else {
					// index가 6이면 보너스 번호
					if(index == 6) {
						bonusNum = tempValue;
						index++; // index가 7이 되면서 while문 탈출
					}else {
						// index 6이전은 로또 숫자
						lotto[index++] = tempValue;
					}
				}
			}
		} // -------------------------------컴퓨터로또 끝----------------------------------------
		
		
		// 오름차순 정렬 - 버블 정렬 ㄴㄴ, arrays를 이용해 쉽게 정렬할 것
		// 내림차순 정렬을 원할 시에는 버블정렬할 것
		Arrays.sort(lotto);
		
		//현재 로또 출력
		//System.out.println("로또 : "+Arrays.toString(lotto)+", 보너스번호: "+bonusNum);
		
		
		
		/*---------------------------사용자의 로또 입력받음---------------------------------*/
		index = 0; // 입력받아야하므로 index초기화
		while(index < 6) {
			System.out.println((index+1)+" 번째 번호를 입력하세요 : ");
			tempValue = scan.nextInt();
			
			if (index == 0) {
				userLotto[index++] = tempValue;
				continue;
			}else {          // 두번째 수 부터 중복확인
				for (int i =0; i < index; i++) {
					if (userLotto[i] == tempValue) {
						isDuplicated = true;
						break;
					}
				}
				
				if (isDuplicated) {
					isDuplicated = false;  //다음번 비교때문에 초기화
				}else {
					// index가 6이면 보너스 번호
					if(index == 6) {
						bonusNum = tempValue;
						index++; // index가 7이 되면서 while문 탈출
					}else {
						// index 6이전은 로또 숫자
						userLotto[index++] = tempValue;
					}
				}
			}
		} // ---------------------------사용자로또 입력완료 -------------------------------------
		
		/* 오름차순정리하기 */
		Arrays.sort(userLotto);
		
		scan.close(); // scanner사용시 닫아줘야함 jdk 1.7부터 생성됨.
		
		/* ########여기서부터는 결과보기 ##########*/
		
		String winnumber = ""; // 당첨번호
		int wincount     = 0;  // 당첨갯수
		int bonusCOUNT   = 0;  // 보너스번호 당첨
		
		// ---------------------------------로또 비교 -----------------------------------
		for (int i =0; i<6; i++) {
			if (lotto[i] == userLotto[i]) {
				wincount++;                      // 당첨갯수 증가시킴
				winnumber += userLotto[i] + ","; // 당첨번호 체크
			}
			
			// 보너스 번호 맞는게 있는지 체크
			// 보너스 카운터를 찾았으면 더 할 필요가 없으므로
			if (bonusCOUNT == 0) {
				if (userLotto[i] == bonusNum) {
					bonusCOUNT++;
				}
			}
		} // ------------------------------비교 끝------------------------------------------
		
		if (wincount > 0) {
			if (wincount == 5 && bonusCOUNT == 1) {
				winnumber += bonusNum;
			} else {
				//문장 마지막 콤마 지우려고 사용
				winnumber = winnumber.substring(0, winnumber.length()-1); // 문자열 (시작,끝)사이 문자열을 가져옴
			}
			
		}else {
			winnumber = "꽝! 맞은 번호 없음!";
		}
		
		System.out.println("로또 : "+Arrays.toString(lotto)+", 보너스번호: "+bonusNum);
		System.out.println("사용자 로또 : "+Arrays.toString(userLotto));
		System.out.println("당첨 번호 : "+winnumber);
		
		// 등수 출력 //
		if (wincount == 6) {
			System.out.println("1등입니다!");
		}else if(wincount == 5 && bonusCOUNT == 1) {
			System.out.println("2등입니다!");
		}else if(wincount == 5 && bonusCOUNT == 0) {
			System.out.println("3등입니다!");
		}else if(wincount == 4) {
			System.out.println("4등입니다!");
		}else if(wincount == 3) {
			System.out.println("5등입니다!");
		}else {
			System.out.println("꽝입니다!");
		}
		

	}

}
