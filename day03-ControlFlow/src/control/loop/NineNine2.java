package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stage;
		int time;
		
		System.out.printf("  2단\t      3단\t  4단\n");
		
		for (stage = 1; stage <= 9; stage++) {
			for (time = 2; time <= 4; time++) {
				System.out.printf("%3d X %d = %2d", time, stage, time*stage);
			}
			System.out.printf("\n");
		}
		
		System.out.print("\n");
		System.out.printf("  5단\t      6단\t  7단\n");
		
		for (stage = 1; stage <= 9; stage++) {
			for (time = 5; time <= 7; time++) {
				System.out.printf("%3d X %d = %2d", time, stage, time*stage);
			}
			System.out.printf("\n");
		}

		System.out.print("\n");
		System.out.printf("  8단\t      9단\t\n");
		
		for (stage = 1; stage <= 9; stage++) {
			for (time = 8; time <= 9; time++) {
				System.out.printf("%3d X %d = %2d", time, stage, time*stage);
			}
			System.out.printf("\n");
		}


	}

}
