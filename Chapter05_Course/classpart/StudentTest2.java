package classpart;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student(); // 첫 번째 학생 생성
		student1.studentName = "이순신";
		
		Student student2 = new Student(); // 두 번째 학생 생성
		student2.studentName = "홍길동";
		
		// 메서드 = 함수
		// get 가져온다라는 예약어
		System.out.println(student1.getStudentName());
		System.out.println(student1);
		System.out.println(student2.getStudentName());
		System.out.println(student2);
	}
}