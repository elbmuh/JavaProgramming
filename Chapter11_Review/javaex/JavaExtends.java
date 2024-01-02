package javaex;

public class JavaExtends {
	public static void main(String[] args) {
		Trainee tr = new Trainee();
		tr.name = "김제니";
		tr.age = 100;
		tr.showTrainee();
		
		tr.setTrainee("한소희", 300);
		tr.showTrainee();
		
		NewTrainee nt = new NewTrainee();
		nt.name = "이몽룡";
		nt.age = 400;
		nt.level = "암행어사";
		nt.tel = "010";
		nt.showTrainee();
	}
}