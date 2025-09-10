package 공부;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int M2 = sc.nextInt();
		int M3;
		int i = 0;
		
		M3 = M + M2;
		while ( M3 >= 60 ) {
			if ( M3 > 60 ) {
				H++;
				M3 = M3 - 60;
			}
			if ( H >= 24 ) {
				H = 0;
			}
			break;
			
		}
		System.out.println(H + " " + M3);
		
	}
}




    
    