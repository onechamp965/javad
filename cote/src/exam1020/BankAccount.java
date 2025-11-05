package exam1020;

public class BankAccount {
	
	private static int count = 0;

	private String name;
	private String accountNumber;
	private int balance;
	
	public BankAccount( String name, String accountNumber) {
		this(name, accountNumber, 0);
		count++;
	}
	
	
	public BankAccount( String name, String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		count++;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int withdrawa (int amount) {
		int finalAmount = amount;
		if ( amount > balance) {
			finalAmount = balance;
		}
		balance -= finalAmount;
		return amount;
	}
	
	public int deposit (int amount) {
		balance += amount;
		return balance;
	}
	
}
