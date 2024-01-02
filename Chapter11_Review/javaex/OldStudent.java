// 05. 오버라이딩(Overriding)
package javaex;

public class OldStudent extends OldPerson {
	protected int number;
	protected String memClass;
	protected String subject;
	protected String grade;
	
	@Override
	public void displayPerson() {
		System.out.printf("이름 : %s\t나이 : %d\t주소 : %s\n", name, age, address);
		System.out.printf("학번 : %d\t학과 : %s\t전공 : %s\t 등급 : %s\n", number, memClass, subject, grade);
	}
}