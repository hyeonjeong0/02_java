package account.one;

/**
 * 계좌(Account 티입) 클래스의
 * 인스턴스(객체, 실체) 를 생성하고
 * 
 * 입금기능, 현재 계좌 상태 출력 등을 
 * 테스트하는 클래스
 * @author Administrator
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		// 1. 선언
		Account account;
		Account myAccount;
		
		// 2. 초기화
		account = new Account();
		myAccount = new Account();
		
		// 3. 사용
		// (1) 계좌 생성 직후 상태 출력
		System.out.println("account 의 상태");
		account.print();
		
		System.out.println("Myaccount 의 상태");
		myAccount.print();
		
		// (2) 계좌에 10000원 입금
		System.out.println("account에 10,000원 입금");
		account.deposit(10000);
		
		System.out.println("Myaccount에 100,000원 입금");
		myAccount.deposit(100000);
		
		// (3) 입금 후 상태 출력
		System.out.println("account 의 상태");
		account.print();
		
		System.out.println("Myaccount 의 상태");
		myAccount.print();
		System.out.println("===================================================================");
		
		// (4) 계좌에 5000원 입금
		account.deposit(5000);
		
		// (5) 입금 후 상태 출력
		account.print();
		myAccount.print();
	}

}
