package 공부;

import java.util.Scanner;

public class chap3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int N = sc.nextInt();
		
		for ( int i = N; i <= N; i-- ) {
			System.out.print(i);
			if ( i <= 1 ) {
				break;
			}
		}
	}
}
