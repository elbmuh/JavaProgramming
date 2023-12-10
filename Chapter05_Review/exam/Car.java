// PPT 수정 전 48p 연습문제 1
// PPT 수정 전 50p 연습문제 2
package exam;

public class Car {
	String company = "애스턴마틴";
	String model = "발할라";
	String color = "청록색";
	int maxSpeed = 330;
	int speed;
	
	public Car() {}
	
	public Car(String pCom, String pMod, 
			String pCol, int pMax, int pSpd) {
		company = pCom;
		model = pMod;
		color = pCol;
		maxSpeed = pMax;
		speed = pSpd;
	}
}

// String pCom, String pMod, String pCol, int pMax, int pSpd