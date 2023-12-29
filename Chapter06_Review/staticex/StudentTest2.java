// static 변수로 학번 확인하기
package staticex;

public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentByun = new Student1();
		studentByun.setStudentName("변백현");
		System.out.println(studentByun.serialNum);
		System.out.println(studentByun.studentName + " 학번 : " + studentByun.studentID);
		
		Student1 studentPark = new Student1();
		studentPark.setStudentName("박지민");
		System.out.println(studentPark.serialNum);
		System.out.println(studentPark.studentName + " 학번 : " + studentPark.studentID);
	}
}