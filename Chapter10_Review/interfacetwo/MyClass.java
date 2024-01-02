// 인터페이스 구현하기
package interfacetwo;

public class MyClass implements MyInterface {
	
	// X 인터페이스에서 상속받은 x() 구현
	@Override
	public void x() {
		System.out.println("x()");
	}
	
	// Y 인터페이스에서 상속받은 y() 구현
	@Override
	public void y() {
		System.out.println("y()");
	}
	
	// MyInterface 인터페이스의 myMethod() 구현
	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
	
}