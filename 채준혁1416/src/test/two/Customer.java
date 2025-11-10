package test.two;

public class Customer {
	public String name;
	public String phone;
	public int point;
	
	public Customer(String name, String phone) {
		point = 0;
	}
	public Customer(String name, String phone, int point) {
		this.point = point;
	}
	
	public void upDatePoint( int amount ) {
		this.point += amount;
		System.out.println(point);
	}
	public void SetPoint( int point ) {
		this.point = point;
		System.out.println(point);
	}
}
