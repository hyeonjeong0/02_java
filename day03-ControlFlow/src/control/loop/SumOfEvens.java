package control.loop;

/**
 * 1 ~ 100 사이의 짝수의 합을 구하는 클래스
 * @author Administrator
 *
 */
public class SumOfEvens {

	public static void main(String[] args) {
		int num = 2;
		int sum = 0;
		
		while (num <= 100) {
			sum += num;
			num += 2;
		}
		System.out.printf("1부터 100 사이의 짝수의 합은 %d 입니다.", sum);

	}

}
