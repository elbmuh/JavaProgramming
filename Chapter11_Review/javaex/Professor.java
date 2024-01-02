// 05. 오버라이딩(Overriding)
package javaex;

public class Professor extends Person {
	private String major;
	public Professor(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public void printInfo() {
		System.out.println("<교수>");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("학과 : %s\n", major);
		System.out.println();
	}
}