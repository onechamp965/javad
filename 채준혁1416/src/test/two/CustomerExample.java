package test.two;

public class CustomerExample {

	public static void main(String[] args) {
		Customer cust1 = new Customer("사용자1", "01011111111");
		Customer cust2 = new Customer("사용자2", "01011121111", 100);
		
		cust1.upDatePoint(50);
		
		cust2.upDatePoint(-50);
		
		cust2.SetPoint(200);
	}

}
