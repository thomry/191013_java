
public class ArrayEx5 {

	public static void main(String[] args) {
		int   sum     = 0;
		float average = 0f;
		// 변수 초기값 설정
		
		int[] score = {100, 88, 100, 100, 90};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}

		average = sum / (float)score.length;         // float 계산결과 얻기위해 형변환
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+average);

	}

}
