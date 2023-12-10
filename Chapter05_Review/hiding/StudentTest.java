// PPT 45p, 07. 정보 은닉) 접근 제어자 살펴보기
package hiding;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이상원");
		// studentLee.setStudentName = "이상원"; 은 계속 오류 떠서 이 코드로 대체함.
		// setStudentName에 대한 기본 생성자가 없어서 만들어야 할 것 같다.
		
		System.out.println(studentLee.getStudentName());
	}
}