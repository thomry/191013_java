
public class ArrayEx12 {

	public static void main(String[] args) {
		String[] names = {"Kim", "Park", "Yi"};
		
		for (int i = 0; i < names.length; i++)
			System.out.println("names["+i+"]:"+names[i]); // 배열 names 값들 하나하나 출력
		
		String tmp = names[2]; // 배열 names의 세번째 값을 변수 tmp에 저장
		
		System.out.println("tmp:"+tmp); // tmp출력
		
		names[0] = "Yu"; // 배열 names의 첫번째 값을 변경
		
		for (String str: names) // 항상 true
			System.out.println(str);

	}

}
