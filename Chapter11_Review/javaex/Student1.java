/* 03. 객체 배열
 성적처리 프로젝트
 학생의 번호, 이름, 국어점수, 영어점수, 수학점수를 입력받아 총점, 평균, 학점, 등수와
 과목별 총점, 가장 높은 총점을 구한 후 메뉴에 따라 다음과 같이 처리하시오.
*/
package javaex;

public class Student1 {
	int num; // Primary key
	String name;
	int kor, eng, mat, tot, rank;
	double avg;
	String hak;
	
	public Student1() {}
	public Student1(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.rank = 1;
	}
}