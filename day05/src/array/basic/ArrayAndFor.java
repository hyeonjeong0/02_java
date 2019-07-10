package array.basic;

/**
 * 10칸짜리 int 배열 numbers 를
 * 선언, 생성(0 초기화) 한 후
 * 
 * 각 원소의 값을 
 * 0 번 인덱스부터 9번 인덱스까지
 * 10, 20, 30,..., 100 으로 저장한다.
 * 
 * 배열에 저장된 원소의 합을
 * int summary; 변수에 누적하여
 * 출력하시오.
 * 
 * @author Administrator
 *
 */
public class ArrayAndFor {

	public static void main(String[] args) {
		// 1. 선언
		int[] numbers;
		int summery = 0;
		
		// 2. 초기화
		numbers = new int[10];
		
		// 3. 저장
		System.out.printf("(1) 배열 생성 직후 원소 출력");
		System.out.printf("numbers[]=%d\n", numbers[0]);
		System.out.printf("numbers[1]=%d\n", numbers[1]);
		System.out.printf("numbers[2]=%d\n", numbers[2]);
		System.out.printf("numbers[3]=%d\n", numbers[3]);
		System.out.printf("numbers[4]=%d\n", numbers[4]);
		System.out.printf("numbers[5]=%d\n", numbers[5]);
		System.out.printf("numbers[6]=%d\n", numbers[6]);
		System.out.printf("numbers[7]=%d\n", numbers[7]);
		System.out.printf("numbers[8]=%d\n", numbers[8]);
		System.out.printf("numbers[9]=%d\n", numbers[9]);
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		numbers[5] = 60;
		numbers[6] = 70;
		numbers[7] = 80;
		numbers[8] = 90;
		numbers[9] = 100;
		
		System.out.printf("\n");
		System.out.printf("(2) 값 할당 후 원소 출력");
		System.out.printf("numbers[0]=%d\n", numbers[0]);
		System.out.printf("numbers[1]=%d\n", numbers[1]);
		System.out.printf("numbers[2]=%d\n", numbers[2]);
		System.out.printf("numbers[3]=%d\n", numbers[3]);
		System.out.printf("numbers[4]=%d\n", numbers[4]);
		System.out.printf("numbers[5]=%d\n", numbers[5]);
		System.out.printf("numbers[6]=%d\n", numbers[6]);
		System.out.printf("numbers[7]=%d\n", numbers[7]);
		System.out.printf("numbers[8]=%d\n", numbers[8]);
		System.out.printf("numbers[9]=%d\n", numbers[9]);
		
		System.out.printf("\n");
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = (idx + 1) * 10;
			summery += numbers[idx];
		}
		System.out.printf("원소의 합 : %d\n", summery);

	}

}
