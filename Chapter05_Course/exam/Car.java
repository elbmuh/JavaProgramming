package exam;

public class Car {
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	public Car() {}
	public Car(String pname, String pmodel, String pcolor, int pmaxSpeed, int pspeed) {
		company = pname;
		model = pmodel;
		color = pcolor;
		maxSpeed = pmaxSpeed;
		speed = pspeed;
	}
}