package ch03_sec01;

public class OperationEx1 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 100;
		int korScore = 85;
		
		System.out.println("수학 : " + mathScore);
		System.out.println("영어 : " + engScore);
		System.out.println("국어 : " + korScore);
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println("총점 : " + totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.printf("평균 : %5.2f", avgScore);
	}
}
