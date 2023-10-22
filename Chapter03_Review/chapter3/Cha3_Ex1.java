// 연습문제 1 : 
// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 
// 1인당 몇 개를 가질 수 있고, 마지막에 몇 개가 남는지를 구하는 코드이다.
package chapter3;

public class Cha3_Ex1 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필 수 
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}
}