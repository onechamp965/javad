package exam1015;

public class OrderItem {
	private Menu menu;
	private int quantity;

	public OrderItem(Menu menu, int quantity) {
		this.menu = menu;
		this.quantity = quantity;
	}
	
	public int getPrice() {
		return menu.price * quantity;
	}
}
