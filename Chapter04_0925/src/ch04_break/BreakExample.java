package ch04_break;

public class BreakExample {
	public static void main(String[] args) {
		
		while (true) {
			int num =(int)(Math.random()*50) + 1; 
			System.out.println("발생된 정수" + num);
			
			if (num == 20) break;
		}
		
		System.out.println("프로그램 종료");
	}
}
