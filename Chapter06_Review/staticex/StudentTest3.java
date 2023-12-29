// static (클래스 변수)
package staticex;

public class StudentTest3 {
	public static void main(String[] args) {
		Student1 studentByun = new Student1();
		studentByun.setStudentName("변백현");
		System.out.println(Student1.serialNum); // serialNum 변수를 직접 클래스 이름(Student1)으로 참조
		System.out.println(studentByun.studentName + " 학번 : " + studentByun.studentID);
		
		Student1 studentPark = new Student1();
		studentPark.setStudentName("박지민");
		System.out.println(Student1.serialNum); // serialNum 변수를 직접 클래스 이름(Student1)으로 참조
		System.out.println(studentPark.studentName + " 학번 : " + studentPark.studentID);
	}
}