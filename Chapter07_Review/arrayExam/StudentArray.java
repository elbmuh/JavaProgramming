package arrayExam;

public class StudentArray {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		
		students[0] = new Student(1001, "이순신");
		students[1] = new Student(1002, "김유신");
		students[2] = new Student(1003, "정몽주");
		
		for (int i = 0; i < students.length; i++) {
			students[i].showStudentInfo();
		}
	}
}