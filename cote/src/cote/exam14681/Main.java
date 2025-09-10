package cote.exam14681;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		if ( m > 0 && n > 0) {
			System.out.println("1");
		} else if ( m < 0 && n > 0 ) {
			System.out.println("2");
		} else if ( m < 0 && n < 0 ) {
			System.out.println("3");
		} else if ( m > 0 && n < 0 ) {
			System.out.println("4");
		}
	}
}
