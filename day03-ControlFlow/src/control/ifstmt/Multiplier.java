package control.ifstmt;

import java.util.Scanner;

/**
 * 입력된 정수에 대해서 2의 배수인지 판별하는 클래스
 * 
 * 입력된 정수를 input 변수에 저장하고
 * 입력된 값이 2의 배수인지 판단하는 조건을 작성하시오
 * 
 * -----------------------------------------------------
 * 2의 배수일 때 : "입력값 4는 2의 배수입니다."
 * 2의 배수가 아닐 때 : "입력값 5는 2의 배수가 아닙니다."
 * -----------------------------------------------------
 * "나머지가 1 입니다.
 * 
 * @author Administrator
 *
 */
public class Multiplier {

	public static void main(String[] args) {
		// 1. 선언
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.println("정수를 입력하세요 : ");
		a = s.nextInt();
		
		if (a % 2 == 0) {
			System.out.printf("입력값 %d 은(는) 2의 배수입니다.\n", a);
		}
		if (a % 2 != 0) {
			System.out.printf("입력값 %d 은(는) 2의 배수가 아닙니다.\n", a);
		}
		System.out.printf("나머지는 %d 입니다.", (a % 2));

	}

}
