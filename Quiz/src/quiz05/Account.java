package quiz05;
public class Account {
	/*
	 * 멤버변수- 예금주이름, 비밀번호, 잔액으로 선언
	 * 생성자 - 3가지 멤버 변수를 모두 매개값으로 받아 초기화하는 생성자를 선언
	 * 메서드 - 입금기능 메서드(deposit:void), 출금기능 메서드(withDraw:void)
	 *        잔액 조회 메서드(getbalance:int)
	 * 아래와 같이 실행 될 수 있도록 클래스를 만드세요.
	 */	
		String name;
		String password;
		int balace;
	
	Account() {}
	
	Account (String n, String p, int b) { 
		name = n;
		password = p;
		balace = b;
	}
	void deposit(int a) { //입금
		balace += a;
	}
	void withDraw(int a) { //출금
		balace -= a;
	}
	int getbalance() { //잔액조회
		
		return balace;
	}
}
