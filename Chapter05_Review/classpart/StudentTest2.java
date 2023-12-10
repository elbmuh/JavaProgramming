// 24p 참조변수 출력
package classpart;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student(); // 첫 번째 학생 생성
		student1.studentName = "이순신";	  // 참조변수.멤버변수
		
		Student student2 = new Student(); // 두 번째 학생 생성
		student2.studentName = "강감찬";
		
		System.out.println(student1.getStudentName());
		System.out.println(student1);
		System.out.println(student2.getStudentName());
		System.out.println(student2);
	}
}