// PPT 32p 2개의 생성자를 가진 클래스
package classpart;

public class Circle1 {
	int radius;
	String name;
	
	public Circle1() { // 매개변수 없는 생성자
		radius = 1;   // radius의 초기값은 1로 설정
		name = "";
	}
	
	public Circle1(int r, String n) { // 매개변수를 가진 생성자 
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle1 pizza = new Circle1();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle1 donut = new Circle1();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}