package Day02;

public class Ex02_PlusMinusOperator {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		
		//증감 연산자
		// ++a, a++		:a를 1 증가		: a = a + 1
		// --a, a--		:a를 1 감소		: a = a - 1
		// a + 1 이라고만 쓰면 안되고 a = a + 1 이라고 써야한다.
		// 이 형태를 자주 쓰다보니 간단하게 증감연산자로 만든것이다.
		
		
		// 전위 연산자		: 연산자 우선순위가 가장 높다
		c = ++a + b;
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		
		int x = 10;
		int y = 20;
		int z;
		
		//후위 연산자		: 연산자 우선순위가 가장 낮다
		z = x++ + y;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
	}

}
