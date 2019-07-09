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
public class Grade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		char grade;
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("0 ~ 100 사이의 정수를 입력 : ");
		score = scan.nextInt();
		
		if (score >= 90) {
			grade = 'A';
			
		} else if (score >= 80) {
			grade = 'B';
			
		} else if (score >= 60) {
			grade = 'C';
			
		} else if (score >= 40) {
			grade = 'D';
			
		} else {
			grade = 'F';  
		}
		
		System.out.printf(score + " 점에 해당하는 학점은 : " + grade + "입니다", score, grade);

	}

}
