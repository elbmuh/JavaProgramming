package ch04_break;

public class BreakExample {
	public static void main(String[] args) {
		
		while (true) {
			int num =(int)(Math.random()*50) + 1; 
			System.out.println("�߻��� ����" + num);
			
			if (num == 20) break;
		}
		
		System.out.println("���α׷� ����");
	}
}
