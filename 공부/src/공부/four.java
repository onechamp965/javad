package 공부;

import java.util.ArrayList;
import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int money = 10000;
		while (money > 0) {
			System.out.print("가격을 입력하세요: ");
			int price = sc.nextInt();
			
			money = money - price;
			System.out.println("거스름돈: " + money);
		}
	}
}
