package classpart;

// 패키지는 소문자,
// 클래스는 대문자로 입력.

public class StudentTest {
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
		// package 이름이 동일하므로 가능.
		// -> main() 함수를 포함한 실행 클래스를 따로 만들 수 있다.
		// 단, 클래스 이름이 같아도 패키지 이름이 다르면 다른 클래스임.
		
		// "classpart" 라는 동일한 패키지에 Student 클래스를 StudentTest에 추가함.
	}
}
