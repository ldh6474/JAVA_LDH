package Day01;

import java.util.Scanner;

public class Ex04_InputDouble {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		//합계, 평균
		int sum = x + y + z;
		double avg = (double)sum / 3;
		// 서로다른 자료형인 double과 int와 합쳐지면 double(큰자료형)을 따라간다.
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// avg int(정수)형 변수라서 소수부분을 표현할 수 없다.
		// 평균을 소수점까지 표현하려면 실수형 변수를 사용해야한다.
		sc.close();
		
		
	}
	

}