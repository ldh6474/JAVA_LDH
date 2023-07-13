package Day05;

import java.util.Scanner;

public class Ex01_Multiple {
	
	public static void main(String[] args) {
		// 정수를 하나 입력받아서,
		// 입력 받은 수가 3의 배수인지 아닌지 판단하고 그 여부를 출력하시오.
		// 3의 배수 O : "3의 배수입니다."
		// 3의 배수 x : "3의 배수가 아닙니다."
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if (N % 3 == 0){
		System.out.println("3의 배수입니다");}
		
		else{System.out.println("3의 배수가 아닙니다.");
		
	}
		sc.close();
}
}