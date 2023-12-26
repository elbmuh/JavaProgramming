// 다운캐스팅과 instanceof
// 하위클래스로 형 변환, 다운 캐스팅 예제
package downcasting;
import java.util.ArrayList;

class Shape {
	void draw() { System.out.println("draw Shape"); }
}

class Circle extends Shape {
	void draw() { System.out.println("draw Circle"); }
	void circle() { System.out.println("원 입니다."); }
}

class Rectangle extends Shape {
	void draw() { System.out.println("draw Rectangle"); }
	void rectangle() { System.out.println("사각형 입니다."); }
}

class Triangle extends Shape {
	void draw() { System.out.println("draw Triangle"); }
	void triangle() { System.out.println("삼각형 입니다."); }
}

public class ShapeTest {
	ArrayList<Shape> sList = new ArrayList<Shape>();
	
	public static void main(String[] args) {
		ShapeTest s = new ShapeTest();
		s.addShape();
		System.out.println("\n원래 타입으로 다운 캐스팅");
		s.testCasting();
	}
	
	public void addShape() {
		sList.add(new Circle());
		sList.add(new Rectangle());
		sList.add(new Triangle());
		
		for (Shape s:sList) {
			s.draw();
		}
	}
	
	public void testCasting() {
		for (int i = 0; i < sList.size(); i++) {
			Shape s = sList.get(i);
			
			if (s instanceof Circle) {
				Circle c = (Circle)s;
				c.circle();
			}
			
			else if (s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				r.rectangle();
			}
			
			else if (s instanceof Triangle) {
				Triangle t = (Triangle)s;
				t.triangle();
			}
			
			else {
				System.out.println("지원되지 않는 타입 입니다.");
			}
		}
	}
}