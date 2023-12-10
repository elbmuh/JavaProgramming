// PPT 5장 18~21p 
// 클래스 기능을 구현하는 메서드 (18-19p)
// 클래스 사용과 main() 함수  (20-21p)
package classpart;

public class Student {
	int studentId;		// 학번
	String studentName;	// 학생 이름
	int grade;			// 학년
	String address;		// 주소
	
	// 학생의 이름을 반환하는 메서드
	public String getStudentName() {
		return studentName;
	}
	
	
	// 학생의 이름(name)을 매개변수로 전달하는 메서드
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentKyn = new Student(); // Student 클래스 생성
		studentKyn.studentName = "김연아";
		
		System.out.print(studentKyn.studentName);
		System.out.print(studentKyn.getStudentName());
	}
}