
public class Account {
	
	public static final int min_balance = 0;
	public static final int max_balance = 1000000;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance < Account.min_balance || balance > Account.max_balance) {
			return;
		}
		this.balance = balance;
	}


}
