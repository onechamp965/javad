package 공부;

import java.util.Scanner;

public class one {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		
			int N1 = num % 100 - num % 10;
			int N2 = num % 10;
			int N3 = num % 1;
			
			System.out.println(N1);
			System.out.println(N2);
			System.out.println(N3);
	}
}
