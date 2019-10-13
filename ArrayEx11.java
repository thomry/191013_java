
public class ArrayEx11 {

	public static void main(String[] args) {
		int[] numArr  = new int[10];
		int[] counter = new int[10]; // 10길이의 배열 생성
		
		for (int i =0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10); // 0~9사이의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);         // numArr 배열의 값들을 출력
		}
		System.out.println(); // 줄바꿈
		
		for (int i =0; i < numArr.length; i++) {
			counter[numArr[i]]++; // numArr[i]번호의 배열 count에 해당하는 값자리의 값을 1 증가시킴
		}
		
		for (int i =0; i < numArr.length; i++) {
			System.out.println(i+"의 개수 :"+counter[i]); //개수세기
		}

	}

}
