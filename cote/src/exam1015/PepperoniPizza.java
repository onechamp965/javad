package exam1015;

public class PepperoniPizza {
	public String name = "페퍼로니피자";
	public String size;
	public String toppings = "pepperoni";
	int prices[] = {15000,20000, 25000};
				
	public PepperoniPizza() {
		size = "M";
	}
	public PepperoniPizza(String size) {
		this.size = size;
	}
	
	public void cook() {
		System.out.println(toppings + "을 추가합니다.");
		System.out.println(name + " " + size +  "사이즈를" + " 을 조리합니다.");
		System.out.println(name + " " + size + "사이즈를" +" 이 완성되었니다.");
	}
	
	public void serve() {
		int price;
		switch ( size ) {
			case "S":price = prices[0];
			case "L":price = prices[2];
			default: price = prices[1];
		}
		
		System.out.println("주문하신 " + name + " " + size + "사이즈" + " 입니다. " +  "가격: " + price );
	}
}
