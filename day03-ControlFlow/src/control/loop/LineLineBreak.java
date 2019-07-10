package control.loop;

/**
 * 구구단을 중첩 for 1oop 를 사용해서 출력 
 * 곱셈의 결과가 50을 넘으면 중단하도록 
 * break; 구문과 for 를 조합하여 테스트
 * ---------------------------------------------- 
 * break : 가장 가까운 반복문을 빠져나가는 역할
 * 	 	   또는 switch 구문을 빠져나가는 역할
 * 
 * @author Administrator
 *
 */
public class LineLineBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int stage;
		int time;

		System.out.printf("  2단\t      3단\t  4단\n");

		for (stage = 1; stage <= 9; stage++) {
			for (time = 2; time <= 4; time++) {
				if (stage * time > 50) {
					break;
				}
				System.out.printf("%3d X %d = %2d", time, stage, time * stage);
			}
			System.out.printf("\n");
		}

		System.out.print("\n");
		System.out.printf("  5단\t      6단\t  7단\n");

		for (stage = 1; stage <= 9; stage++) {
			for (time = 5; time <= 7; time++) {
				if (stage * time > 50) {
					break;
				}
				System.out.printf("%3d X %d = %2d", time, stage, time * stage);
			}
			System.out.printf("\n");
		}

		System.out.print("\n");
		System.out.printf("  8단\t      9단\t\n");

		for (stage = 1; stage <= 9; stage++) {
			for (time = 8; time <= 9; time++) {
				if (stage * time > 50) {
					break;
				}
				System.out.printf("%3d X %d = %2d", time, stage, time * stage);
			}
			System.out.printf("\n");
		}

	}

}
