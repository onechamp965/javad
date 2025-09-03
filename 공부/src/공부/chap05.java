package 공부;

import java.util.Scanner;

public class chap05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int N = sc.nextInt();
		
		for ( int i = 1; i <= N; i++ ) {
			for ( int j = N; j <= i; j ++ ) {
				System.out.println("*");
			}
		}
	}
}
