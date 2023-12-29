package chapter6.singleton;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car myBMW = factory.createCar();
		Car yourBMW = factory.createCar();
		
		System.out.println(myBMW.getCarNum());
		System.out.println(yourBMW.getCarNum());
	}
}