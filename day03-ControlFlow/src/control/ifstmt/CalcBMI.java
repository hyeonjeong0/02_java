package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight;
		double height;
		double bmi;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("키와 몸무게를 입력하세요.\n");
		weight = scan.nextDouble();
		height = scan.nextDouble();
		
		bmi = weight / Math.pow(height, 2);
		
		if (bmi<15.0) {
			System.out.println("당신의 BMI는 " + bmi +"입니다.");
			System.out.printf("당신의 비만도는 '병적인 저체중'입니다. ");
			
		} else if (15.0<=bmi && bmi<18.5) {
			System.out.println("당신의 BMI는 " + bmi +"입니다.");
			System.out.printf("당신의 비만도는 '저체중'입니다. ");
			
		} else if (18.5<=bmi && bmi<23.0) {
			System.out.println("당신의 BMI는 " + bmi +"입니다.");
			System.out.printf("당신의 비만도는 '정상'입니다. ");
			
		} else if (23.0<=bmi && bmi<=27.5) {
			System.out.println("당신의 BMI는 " + bmi +"입니다.");
			System.out.printf("당신의 비만도는 '과체중'입니다. ");
			
		} else if (27.5<bmi && bmi<=40.0) {
			System.out.println("당신의 BMI는 " + bmi +"입니다.");
			System.out.printf("당신의 비만도는 '비만'입니다. ");
			
		} else if (40.0<bmi) {
			System.out.println("당신의 BMI는 " + bmi +"입니다.");
			System.out.printf("당신의 비만도는 '병적인 비만'입니다. ");
		}

	}

} 