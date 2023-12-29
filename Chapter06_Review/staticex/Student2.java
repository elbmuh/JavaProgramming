// 클래스 메서드(serialNum의 get(), set() 메서드 사용하기)
package staticex;

public class Student2 {
	private static int serialNum = 5000; // private 변수로 변경
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum; 
		// serialNum 값을 1씩 증가시킨 후 studentID에 대입
	}
	
	public String getStudentName() { return studentName; }
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// serialNum의 get() 메서드 : 클래스 메서드임
	public static int getSerialNum() {
		int i = 10; 
		// i는 지역변수임. 메서드가 끝나면 사라진다. 'getSerialNum()' 내부에서만 사용 가능하다.
		
		return serialNum;
		// serialNum은 static변수임. 'getSerialNum()' 내부에서도 사용 가능하다.
	}
	
	// serialNum의 set() 메서드
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}