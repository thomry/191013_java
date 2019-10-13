
public class ArrayEx7 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for ( int i = 0; i < numArr.length; i++) {
			numArr[i] = i;                          // 배열을 0~9의 숫자로 초기화
			System.out.print(numArr[i]);
		}
		System.out.println();                       // 줄바꿈
		
		for (int i = 0; i < 100; i++) {
			int n   = (int)(Math.random()*10);      // 0~9중 랜덤값 임의로 얻어 int로 행변환
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;                        // numArr[0]과 numArr[n]을 서로 바꿈
		}
		
		for (int i =0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}

	}

}
