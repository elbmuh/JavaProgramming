// 문제 : 학생의 학번, 이름, 점수(3과목)을 저장하고 총점, 평균, 학점을 구하여 출력
package javaex;

public class Student {
	int num;
	String name;
	int kor, eng, mat, tot;
	double avg;
	
	public Student() {}
	
	public Student(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void totAvgCalc() {
		tot = kor + eng + mat;
		avg = tot / 3;
	}
	
	public void print() {
		System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + 
				mat + "\t" + tot + "\t" + avg);
	}
}