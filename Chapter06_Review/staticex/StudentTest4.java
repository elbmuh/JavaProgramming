// 클래스 메서드 (학번 출력하기)
package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentJeon = new Student2();
		studentJeon.setStudentName("전정국");
		System.out.println(Student2.getSerialNum()); // serialNum 값 가져오기 위해 get() 메서드 호출
		
		// 클래스 이름으로 직접 호출
		System.out.println(studentJeon.studentName + " 학번 : " + studentJeon.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손흥민");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);
	}

}