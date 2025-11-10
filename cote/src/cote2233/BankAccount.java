package cote2233;

public class BankAccount {
	private String name;
	private String accountNumber;
	private int balane;
	
	public BankAccount(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	public BankAccount(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balane = balance;
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

	public int getBalane() {
		return balane;
	}

	public void setBalane(int balane) {
		this.balane = balane;
	}

}
