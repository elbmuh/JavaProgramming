// 05. 오버라이딩(Overriding)
package javaex;

public class OldPerson {
	protected String name;
	protected int age;
	protected String address;
	
	public void displayPerson() {
		System.out.printf("이름 : %s\t나이 : %d\t주소 : %s\n", name, age, address);
	}
}