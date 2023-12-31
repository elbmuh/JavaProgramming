// 인터페이스 실행하기
package interfacetwo;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		// 상위 인터페이스 X형으로 대입하면 x에 선언한 메서드 호출 가능
		X xClass = mClass;
		xClass.x();
		
		// 상위 인터페이스 Y형으로 대입하면 y에 선언한 메서드 호출 가능
		Y yClass = mClass;
		yClass.y();
		
		// 구현한 인터페이스형 변수에 대입하면 인터페이스가 상속한 모든 메서드 호출 가능
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}
}