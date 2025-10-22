package exam1020;

public class BankAccountExample {
	public static void main(String []args ) {
	BankAccount account = new BankAccount("김자바", "6394791233423");
	System.out.println(account.getBalance());
	
	int curretBalance = account.deposit(10000);
	System.out.println(curretBalance);
	System.out.println(account.getBalance());
	
	int finalAmount = account.withdrawa(4500);
	System.out.println(finalAmount);
	
	finalAmount = account.withdrawa(70000);
	System.out.println(finalAmount);
	System.out.println(account.getBalance());
	
	System.out.println(BankAccount.getCount());
	BankAccount acount2 = new BankAccount("존 워", "29234234");
	System.out.println(BankAccount.getCount());
	}
}
