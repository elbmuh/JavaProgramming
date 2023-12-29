// static 변수로 학번 자동으로 부여하기
package staticex;

public class Student1 {
	public static int serialNum = 1000;
	// 바로 학번으로 사용하면 모든 학생이 동일한 학번을 가진다.
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student1() {
		serialNum++;
		studentID = serialNum; 
		// serialNum 값을 1씩 증가시킨 후, studentID에 대입한다.
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student1.serialNum = serialNum;
	}
}