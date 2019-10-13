
public class ArrayEx10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		// bubble sort
		// 비효율적이나 간단함.
		
		for (int i =0; i < numArr.length; i++) {
			System.out.print(numArr[i]=(int)(Math.random()*10)); // 배열 numArr에 0~9하나가 저장
		}
		System.out.println();
		
		// ------------------- i ------------------------------------------------
		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리 바꿈이 발생했는지 체크할 boolean
			
			for (int j = 0; j < numArr.length-1-i; j++) { // 반복할 수록 비교해야하는 범위가 줄어드므로 -i
				if (numArr[j] < numArr[j+1]) { // 옆의 값이 작을 때
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;        // 서로 자리를 바꿈
					changed = true; // 자리바꿈 발생했으므로 true로 바꿔줌
				}
			}
			
			if (!changed) break;    // 자리바꿈이 없으면 반복문 벗어남
			
			for (int k=0; k < numArr.length; k++)
				System.out.print(numArr[k]); // 정렬 결과 다시 출력
			System.out.println(); // 줄바꿈
		}// ---------------- i end ------------------------------------------

	}

}
