package classpart;

public class Student {
	int studentId;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student studentAnn = new Student();
		studentAnn.studentName = "안연수";
		
		System.out.print(studentAnn.studentName);
		System.out.print(studentAnn.getStudentName());
	}
}
