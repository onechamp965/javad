package 공부;

import java.util.Scanner;

public class chap4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int N = sc.nextInt();
		int Sum = 0;
		
		for ( int i = 1; i <= N; i++ ) {
			Sum += i;
		}
		System.out.println(Sum);
	}
}
