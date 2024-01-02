// 05. 오버라이딩(Overriding)
package javaex;

public class JavaOverriding {
	public static void main(String[] args) {
		OldPerson person = new OldPerson();
		person.name = "홍길동 어머니";
		person.age = 500;
		person.address = "지리산 산적골";
		person.displayPerson(); // 조상의 메서드
		
		OldStudent student = new OldStudent();
		student.name = "아들 길동이";
		student.age = 500;
		student.address = "대전 광역시";
		student.number = 20231004;
		student.memClass = "마술학과";
		student.subject = "변신술";
		student.grade = "A+";
		student.displayPerson();
		
		Person Person2 = new Person("이순신", 100);
		Professor professor = new Professor("강사", 200, "IT");
		JslStudent JslStudent = new JslStudent("소연이", "IT", "Well", 23);
		// IT : 정보통신 기술, information technology
		
		System.out.println();
		Person2.printInfo();
		professor.printInfo();
		JslStudent.printInfo();
	}
}