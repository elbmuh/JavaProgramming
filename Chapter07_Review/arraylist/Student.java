/*
05. 배열 응용 프로그램
 예제 시나리오)
 1001번 학생 '이순신'과 1002번 학생 '김유신'이 있다.
 이순신은 국어 100점, 수학 70점으로 2개 과목을 수강하고,
 김유신은 국어 80점, 수학 90점, 영어 70점으로 3개 과목을 수강한다.
 위 2명의 과목 성적과 총점 평균을 출력하도록 구현하라.
 
 05-1) Student 클래스 구현하기
*/
package arraylist;
import java.util.ArrayList;

public class Student {
	// Student 클래스의 멤버 변수
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList 선언하기
	
	// 생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // ArrayList 생성하기
	}
	
	// 학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); // Subject 생성하기
		subject.setName(name);			 // 과목 이름 추가하기
		subject.setScorePoint(score);	 // 점수 추가하기
		subjectList.add(subject);		 // 배열에 저장하기
	}
	
	public void showStudentInfo() {
		int total = 0;
		double avg = 0;
		
		// 배열 요소값 출력
		for (Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + 
					" 과목 성적은 " + s.getScorePoint() + "점 입니다.");
		}
		
		System.out.println("학생 " + studentName + "의 총점은 " + total + "점 입니다.");
		System.out.println("학생 " + studentName + "의 평균은 " + 
				(double)(total/subjectList.size()) + "점 입니다.");
	}
}