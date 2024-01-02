// 05. 오버라이딩(Overriding)
package javaex;

public class JslStudent extends Person {
	private String majorClass;
	private String grade;
	
	public JslStudent(String name, String majorClass, String grade, int age) {
		super(name, age);
		this.majorClass = majorClass;
		this.grade = grade;
	}
	
	public void printInfo() {
		System.out.println("<학생>");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("학과 : %s\n", majorClass);
		System.out.printf("등급 : %s\n", grade);
		System.out.println();
	}
}