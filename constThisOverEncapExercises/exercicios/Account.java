package exercicios;

public class Account {
	private final int account;
	private String holder;
	private double balance;
	
	public Account(int account, String holder, double balance) {
		this.account = account;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Account(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance(){
		return balance;
	}
	public String getHolder(String holder) {
		return holder;
	}
	
	public void initialDeposit(double deposit) {
		balance += deposit;
	}
	
	public void depositValue(double deposit) {
		balance += deposit;
	}
	
	public void withdrawValue(double withdraw) {
		balance -= withdraw;
	}
	
	public String toString() {
		return "Account " + account + " , Holder: " + holder + ", Balance: " + balance;
	}
}
