package Day02;

import java.util.Scanner;

public class Ex20_Star1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				// i : 1, j : 1
				// i : 2, j : 1 2
				// i : 3, j : 1 2 3
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}
