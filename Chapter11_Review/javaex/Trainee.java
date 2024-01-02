// 04. 상속
package javaex;

public class Trainee {
	String name;
	int age;
	
	public void setTrainee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showTrainee() {
		System.out.println(name + " " + age);
	}
}