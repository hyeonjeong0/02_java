package array.basic;

public class StringArrayIntList {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		String[] students =
			{"정하은", "최현정", "김지후", "정현수"};
		
		// 3. 출력 (foreach)
		for (String name: students) {
			System.out.printf("학생의 이름 = " + name + "\n");
		}
		
	}

}
