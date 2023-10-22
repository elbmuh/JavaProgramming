package classpart;

public class Circle_02 {
	int radius;
	void set(int r) { radius = r; }
	double getArea() { return 3.14*radius*radius; }
	
	public Circle_02(int r) {
		radius = r;
	}
	
	public static void main(String[] args) {
		Circle_02 pizza = new Circle_02(10);
		System.out.println(pizza.getArea());
		
		Circle donut = new Circle();
		System.out.println(donut.getArea());
	}
	
}
