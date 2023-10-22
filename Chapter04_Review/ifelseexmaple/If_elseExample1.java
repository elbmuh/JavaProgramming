package ifelseexmaple;

public class If_elseExample1 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 100) + 0;
		char grade = 'A';
		
		if (score >= 90) { grade = 'A'; }
		else if (score >= 80) { grade = 'B'; }
		else if (score >= 70) { grade = 'C'; }
		else if (score >= 60) { grade = 'D'; }
		else if (score <= 59) { grade = 'F'; }
		
		
		System.out.println("점수가 " + score + "점 입니다.");
		System.out.printf("등급은 " + grade + "입니다.");
	}
}