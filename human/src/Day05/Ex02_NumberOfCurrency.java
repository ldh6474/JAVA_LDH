package Day05;

import java.util.Scanner;

/**
 * 화폐 매수 구하기
 * 
 * 금액 : 547620 50000 : 10개 10000 : 4개 5000 : 1개 1000 : 2개 500 : 1개 100 : 1개 50 :
 * 0개 10 : 2개 5 : 0개 1 : 0개
 * 
 * 위와 같이 금액을 입력하면, 큰 화폐단위부터 계산하여 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 */
public class Ex02_NumberOfCurrency {
	
	/*
	 * 1. 필요한 변수 선언
	 * - (입력금액), (화폐매수), (화폐단위)
	 * 2.(입력금액) 입력
	 * 3. 화폐 매수 계산
	 * [조건] : 큰 화폐 단위부터 계산한다.
	 * 		3-1. 화폐 매수 계산
	 * 		537620 / 50000 = 10
	 * 		(화폐매수) = (입력금액 ) / (화폐단위)
	 *		
	 *		3-2. 잔액 계산
	 *		537620 % 50000 = 37620
	 *		or 537620 - (50000*10) = 37620
	 *		i)(잔액) = (입력금액) % (화폐단위)
	 *		ii)(잔액) = (입력금액) - (화폐단위*화폐매수)
	 *
	 *		3-3. 화폐단위 변환
	 *		번갈아가면서, /5, /2 연산을 반복한다.
	 *		(화폐단위) = (화폐단위) / 5
	 *		(화폐단위) = (화폐단위) / 2
	 *
	 * 4. 3번의 과정을 반복
	 * 	- 반복조건 : (화폐단위)가 1보다 크거나 같으면 반복
	 * 
	 * 5. 3-1 에서 구한 화폐매수를 출력한다.
	 *
	 */
	 
	 
	 
	
	

	public static void main(String[] args) {

		int input; //1.입력금액 변수 선언
		
		int count; // 화폐매수 변수 선언
		
		int money=50000; // 화폐단위 변수 선언: 큰 화폐단위부터 시작
		
		Scanner sc = new Scanner(System.in); // 2.입력금액입력
		System.out.print("금액 :");
		input = sc.nextInt();
		
		boolean sw = true;
		
		while( money >= 1) {//4. 3번의 과정을 반복
			
			count = input / money; //3.화폐매수 = 임력금액 / 화폐단위
			
			System.out.println(money + "\t :" + count + "개");
			
			input = input - (money*count);//잔액=입력금액-(화폐단위*화폐매수)
			//or input = input % money;
			
			if (sw)
			money = money / 5; // 화폐단위 = 화폐단위 / 5
			else
			money = money / 2; // 화폐단위 = 화폐단위 / 2
			sw = !sw;
			
		}
		
		sc.close();
		}
		
			
		

}
