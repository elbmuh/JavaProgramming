package ifelseexample;

public class If_elseExample1 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*100)+0;
		
		if (score >= 90) {
			System.out.println("������ " + score + "�� �Դϴ�.");
			System.out.println("����� A�Դϴ�.");
		}
		
		else if (score >= 80) {
			System.out.println("������ " + score + "�� �Դϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
		
		else if (score >= 70) {
			System.out.println("������ " + score + "�� �Դϴ�.");
			System.out.println("����� C�Դϴ�.");
		}
		
		else if (score >= 60) {
			System.out.println("������ " + score + "�� �Դϴ�.");
			System.out.println("����� D�Դϴ�.");
		}
		
		else {
			System.out.println("������ " + score + "�� �Դϴ�.");
			System.out.println("����� F�Դϴ�.");
		}
	}
}
