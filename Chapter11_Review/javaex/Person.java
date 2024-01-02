// 05. 오버라이딩(Overriding)
package javaex;

public class Person {
	protected String name;
	protected int age;
	
	protected Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("<개인>");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.println();
	}
}