package ifelseexample;

public class If_elseExample1 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*100)+0;
		
		if (score >= 90) {
			System.out.println("점수가 " + score + "점 입니다.");
			System.out.println("등급은 A입니다.");
		}
		
		else if (score >= 80) {
			System.out.println("점수가 " + score + "점 입니다.");
			System.out.println("등급은 B입니다.");
		}
		
		else if (score >= 70) {
			System.out.println("점수가 " + score + "점 입니다.");
			System.out.println("등급은 C입니다.");
		}
		
		else if (score >= 60) {
			System.out.println("점수가 " + score + "점 입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		else {
			System.out.println("점수가 " + score + "점 입니다.");
			System.out.println("등급은 F입니다.");
		}
	}
}
