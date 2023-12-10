package exam;

public class CarExample {
	public static void main(String[] args) {
		Car myCar1 = new Car();
		
		System.out.println("제작회사: " + myCar1.company);
		System.out.println("모델명: " + myCar1.model);
		System.out.println("색깔: " + myCar1.color);
		System.out.println("최고속도: " + myCar1.maxSpeed);
		System.out.println("현재속도: " + myCar1.speed);
		
		myCar1.speed = 110;
		System.out.println("수정된 속도: " + myCar1.speed);
		
		System.out.println("----------------------------");
		
		Car myCar2 = new Car("링컨", "네비게이터", "화이트", 275, 80);
		System.out.println("제작회사: " + myCar2.company);
		System.out.println("모델명: " + myCar2.model);
		System.out.println("색깔: " + myCar2.color);
		System.out.println("최고속도: " + myCar2.maxSpeed);
		System.out.println("현재속도: " + myCar2.speed);
	}
}