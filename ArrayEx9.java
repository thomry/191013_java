import java.util.*; // Arrays.toString()을 사용하기위해 import

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11};
		int[] arr  = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			int tmp = (int)(Math.random()*code.length); // tmp변수에 code.length를 넘지않는 만큼 랜덤의 숫자를 저장
			arr[i]  = code[tmp];                        // 배열 arr에 랜덤한 배열 code안의 값을 저장
		}
		
		System.out.println(Arrays.toString(arr));       // 배열 arr출력

	}

}
