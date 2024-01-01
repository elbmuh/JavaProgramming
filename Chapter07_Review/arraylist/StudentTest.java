// 05-3) 결과 확인하기_학생 성적 출력
package arraylist;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1001, "이순신");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 70);
		
		
		Student studentKim = new Student(1002, "김유신");
		
		studentKim.addSubject("국어", 80);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 70);
		
		studentLee.showStudentInfo();
		System.out.println("\n===========================");
		studentKim.showStudentInfo();
	}
}