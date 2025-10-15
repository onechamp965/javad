package exam1015;

import java.util.Scanner;

public class OrderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[2];
		menus[0] = new Menu("카페라떼", 3000);
		menus[1] = new Menu("초코라떼", 2500);

		Scanner sc = new Scanner(System.in);
		int memuIndex = sc.nextInt();
		int quantity = sc.nextInt();
		sc.close();
		
		if (memuIndex >= 0 && memuIndex < menus.length && quantity > 0) {
			OrderItem o = new OrderItem(menus[memuIndex], quantity);
			System.out.println(o.getPrice());
		}
		
	}
}
