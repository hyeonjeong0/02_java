package control.loop;

/**
 * 1. 50 ~ 0 까지 짝수만 역순으로 출력
 * (1) continue 없이
 * (2) continue 사용
 * 
 * 2. 1 ~ 10 까지 제곱표를 출력
 * 
 * @author Administrator
 *
 */
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int idx = 50; idx >= 2; idx-=2) {
			System.out.printf("0 ~ 50 까지 짝수 : %d\n", idx);
		}
		
		System.out.printf("\n--------------------------------------------------------------\n");
		
		for (int i = 50; i >= 2; i--) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.printf("0 ~ 50 까지 짝수 : %d\n", i);
		}



	}

}
