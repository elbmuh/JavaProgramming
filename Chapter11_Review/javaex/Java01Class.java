// 02. 클래스
// 문제 : 학생의 학번, 이름, 점수(3과목)을 저장하고 총점, 평균, 학점을 구하여 출력
package javaex;

public class Java01Class {
	// 멤버변수(전역변수)
	int num;	  // 학생의 학번
	String name;  // 이름
	int kor;	  // 국어 점수
	int eng;	  // 영어 점수
	int mat;	  // 수학 점수
	int tot;	  // 총점
	double avg;	  // 평균
	String grade; // 학점
	int rank;	  // 순위
	
	void totAvgGrade() {
		tot = kor + eng + mat;
		avg = tot / 3;
		
		if (avg >= 90) grade = "A";
		else if (avg >= 80) grade = "B";
		else if (avg >= 70) grade = "C";
		else if (avg >= 60) grade = "D";
		else grade = "F";
	}
	
	public static void main(String[] args) {
		// 객체 생성 방법
		Java01Class j01 = new Java01Class();
		
		// 멤버변수에 값을 저장하는 방법
		j01.num = 1;
		j01.name = "석진";
		j01.kor = 100;
		j01.eng = 100;
		j01.mat = 100;
		j01.totAvgGrade();
		System.out.println(j01.num + " " + j01.name + " " + j01.kor + " " + 
			j01.eng + " " + j01.mat + " " + j01.tot + " " + j01.avg + " " + j01.grade);
		
		
		Java01Class j02 = new Java01Class();
		j02.num = 2;
		j02.name = "정국";
		j02.kor = 100;
		j02.eng = 30;
		j02.mat = 95;
		j02.totAvgGrade();
		System.out.println(j02.num + " " + j02.name + " " + j02.kor + " " + 
			j02.eng + " " + j02.mat + " " + j02.tot + " " + j02.avg + " " + j02.grade);
	}
}