package exercicios;

public class Account {
	private final int account;
	private String holder;
	private double balance;

	public Account(int account, String holder, double initialDeposit) {
		this.account = account;
		this.holder = holder;
		depositValue(initialDeposit);
	}

	public Account(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}
	
	public int account() {
		return account;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public String getHolder(String holder) {
		return holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void initialDeposit(double deposit) {
		balance += deposit;
	}

	public void depositValue(double deposit) {
		balance += deposit;
	}

	public void withdrawValue(double withdraw) {
		balance -= withdraw + 5;
	}

	public String toString() {
		return "Account " + account + " , Holder: " + holder + ", Balance: " + balance;
	}
}
