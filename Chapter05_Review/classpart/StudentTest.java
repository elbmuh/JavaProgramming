// PPT 22p, main() 함수를 포함한 실행 클래스 따로 만들기
package classpart;

public class StudentTest {
	public static void main(String[] args) {
		Student studentJk = new Student();
		studentJk.studentName = "전정국";
		
		System.out.println(studentJk.studentName);
		System.out.println(studentJk.getStudentName());
	}
}

// 패키지 이름이 동일해서 가능하다.
// 클래스 이름이 같아서 패키지 이름이 다르면 다른 클래스이다.
// 즉, 하나의 패키지 안에 있는 클래스들은 함수를 넘나들며 사용 가능하다고 이해함.

// Student 클래스 자료형으로 studentJk 변수를 선언했다.
// new Student();로 클래스를 생성하여 studentJk(참조변수)에 대입