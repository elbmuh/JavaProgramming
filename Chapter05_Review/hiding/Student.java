// PPT 44p, 07. 정보 은닉) 접근 제어자 살펴보기
package hiding;

public class Student {
	int studentID;
	private String studentName;
	// private 으로 선언한 변수나 메서드는 외부 클래스에서 접근 및 사용 불가능하다.
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}