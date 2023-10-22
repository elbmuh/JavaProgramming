package exam;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		
		System.out.println("------------------");
		
		Car myCar2 = new Car("기아", "K8", "그레이", 320, 10);
		System.out.println("제작회사: " + myCar2.company);
		System.out.println("모델명: " + myCar2.model);
		System.out.println("색깔: " + myCar2.color);
		System.out.println("최고속도: " + myCar2.maxSpeed);
		System.out.println("현재속도: " + myCar2.speed);
	}
}