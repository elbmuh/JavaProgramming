package javaex;

public class Java02Class {
	public static void main(String[] args) {
		// 객체 생성 이후 직접 접근해서 값을 저장하는 방법
		Student stu1 = new Student();
		stu1.num = 1;
		stu1.name = "다백점";
		stu1.kor = 100;
		stu1.eng = 100;
		stu1.mat = 100;
		stu1.totAvgCalc();
		
		// 생성자를 호출하여 멤버변수에 값을 저장할 수 있다.
		Student stu2 = new Student(2, "왕자림", 90, 90, 90);
		stu2.totAvgCalc();
		
		Student stu3 = new Student(3, "공주영", 100, 75, 80);
		stu3.totAvgCalc();
		
		stu1.print();
		stu2.print();
		stu3.print();
	}
}