// 싱글톤 패턴으로 자동차 클래스 구현하기 (private 생성자 만들기)
package chapter6.singleton;

public class Car {
	private static int serialNum = 10000;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() { return carNum; }
	
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}