package Day04.Ex03_Car;

public class CarEx {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.model = "K5";
		//car.speed = "200";
		//private 으로 지정된 변수는 외부에서 접근 불가능
		car.setSpeed(200);
		System.out.println("model : " + car.getModel());
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(-100);
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(500);
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(80);
		System.out.println("speed : " + car.getSpeed());
		
		
	}

}
