
public class ArrayEx8 {

	public static void main(String[] args) {
		int[] ball = new int[45]; // 45개의 배열 생성
		
		// 배열에 1~45 저장
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		
		int temp = 0;
		int j    = 0; // 변수 초기값 설정
		
		for (int i =0; i < 6; i++) {             // 0~5번째의 요소, 총 6개의 값을 바꿈
			j       = (int)(Math.random()*45);   // 0~44범위의 랜덤 값을 취득
			temp    = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;                      // ball[i]와 ball[j]의 값을 바꿈
		}
		
		for (int i = 0; i < 6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]); // ball의 앞 6개의 요소 출력

	}

}
