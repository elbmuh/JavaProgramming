// 예제) 객체 배열 만들기
package arrayExam;

public class Student {
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}
}