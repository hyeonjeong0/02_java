package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문 사용하여 다음의 기준으로
 * 학점을 계산하는 클래스
 * -------------------------------------------
 * A : 90점 이상
 * B : 80 ~ 89점 사이
 * C : 60 ~ 79점 사이
 * D : 40 ~ 59점 사이
 * F : 이후 나머지
 * 
 * @author Administrator
 *
 */
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a;
		
		System.out.printf("0 ~ 100 사이의 정수를 입력 : \n");
		a = scan.nextInt();
		
		if (a >= 90) {
			System.out.printf("A");
		} else if (a >= 80) {
			System.out.printf("B");
		} else if (a >= 60) {
			System.out.printf("C");
		} else if (a >= 40) {
			System.out.printf("D");
		} else if (a < 40) {
			System.out.printf("F");
		}
		
		System.out.printf(" 학점 입니다.");
						
				
			

	}

}
