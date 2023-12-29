// static 변수 테스트하기
package staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); // 초깃값 출력
		studentLee.serialNum++;					  // static 변수 증가
		System.out.println("이름: " + studentLee.studentName); // 이름(이지원) 출력
		System.out.println("학번: " + studentLee.serialNum);   // 증가된 학번 값 출력
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println("이름: " + studentSon.studentName); // 이름(손수경) 출력
		System.out.println("학번: " + studentSon.serialNum);   // 증가된 학번 값 출력
	}
}