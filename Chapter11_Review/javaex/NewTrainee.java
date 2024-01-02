package javaex;

public class NewTrainee extends Trainee {
	String level;
	String tel;
	
	@Override
	public void showTrainee() {
		System.out.println(name + " " + age + " " + level + " " + tel);
	}
}