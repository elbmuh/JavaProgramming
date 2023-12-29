// 외부에서 참조할 수 있는 public 메서드 만들기
package chapter6.singleton;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}