package control.ifstmt;

import java.util.Scanner;

/**
 * 하나의 정수를 입력 받아서
 * 음수인지, 양수인지 판단하는 클래스
 * 
 * 단, 여기서는 0에 대한 판단은 하지 않는다.
 * 
 * 입력 받을 변수 input 을 선언하여 scanner 로 입력을 받고
 * if ~ else 구문으로 부호를 판별
 * 
 * "입력값 100 은(는) 양수 입니다."
 * "입력값 -1 은(는) 음수 입니다." 
 *
 * 판별 결과를 저장하는 별수 String result 에 저장하여
 * 
 * @author Administrator
 *
 */
public class PositiveNegative {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		String result;
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		if (input > 0)
		{
			result = "양수";
		}
		if (input < 0)
		{
			result = "음수";
		}
		
		System.out.printf("입력된 값은 %d 입니다.", input);
		System.out.printf(" %d 은(는) %s 입니다.", input, result);
		

	}

}
