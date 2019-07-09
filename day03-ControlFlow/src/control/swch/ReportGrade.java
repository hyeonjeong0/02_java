package control.swch;

import java.util.Scanner;

/**
 * switch 구문 사용하여 다음의 기준으로
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
public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언
		int a;
		char grade;
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("0 ~ 100 사이의 정수를 입력 : \n");
		a = scan.nextInt();
		
		switch (a / 10) {
		case 10 : case 9 :
			grade = 'A';
			System.out.printf("%d 점은 %s 학점입니다.", a, grade);
			break;
		
		case 8 : 
			grade = 'B';
			System.out.printf("%d 점은 %s 학점입니다.", a, grade);
			break;
			
		case 7 : case 6 :
			grade = 'C';
			System.out.printf("%d 점은 %s 학점입니다.", a, grade);
			break;
			
		case 5 : case 4 :
			grade = 'D';
			System.out.printf("%d 점은 %s 학점입니다.", a, grade);
			break;
			
		default :
			grade = 'F';
			System.out.printf("%d 점은 %s 학점입니다.", a, grade);
		}	

		

	}

}
