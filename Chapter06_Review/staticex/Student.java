// 03. static 변수
// static 변수 사용하기
package staticex;

public class Student {
	public static int serialNum = 1000; // 학번
	int studentID;		// 학생 학번
	String studentName; // 학생 이름
	int grade;			// 학생 학년
	String address;		// 학생 주소
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}