package ch06_ex;

import java.util.Scanner;
public class Ex2_KeyControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean run = true;
		int speed = 10;
		
		while (run) {
			System.out.println("------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.next();
			
			if (strNum.equals("1")) {
				speed += 1;
				System.out.println("현재 속도 = " + speed);
			}
			
			else if (strNum.equals("2")) {
				speed -= 1;
				System.out.println("현재 속도 = " + speed);
			}
			
			else if (strNum.equals("3")) { run = false; }
			
			System.out.println("프로그램 종료");
		}
	}
}
