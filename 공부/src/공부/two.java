package 공부;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		for ( int i = 1; i <= num; i++) {
			for ( int j = 1; j <= num; j++) {
				if ( i % j != 0) {
					System.out.print(" " + i);
				}
			}
		}
	}
}
