package exam1015;

public abstract class Pizza {
	public String name;
	public int[] prices;
	public String size;
	public String toppings;

	public void cook() {
		System.out.println(name + " " + size +  "사이즈를" + " 을 조리합니다.");
		System.out.println(name + " " + size + "사이즈를" +" 이 완성되었니다.");
	}
	
	public void serve() {
		int price;
		switch ( size ) {
			case "S":price = prices[0]; break;
			case "L":price = prices[2]; break;
			default: price = prices[1];
		}
		
		System.out.println("주문하신 " + name + " " + size + "사이즈" + " 입니다. " +  "가격: " + price );
	}
}
