package ch06_ex;

import java.util.Scanner;
public class Ex2_KeyControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean run = true;
		int speed = 10;
		
		while (run) {
			System.out.println("------------------------");
			System.out.println("1. ���� | 2. ���� | 3. ����");
			System.out.println("------------------------");
			System.out.println("����: ");
			
			String strNum = scanner.next();
			
			if (strNum.equals("1")) {
				speed += 1;
				System.out.println("���� �ӵ� = " + speed);
			}
			
			else if (strNum.equals("2")) {
				speed -= 1;
				System.out.println("���� �ӵ� = " + speed);
			}
			
			else if (strNum.equals("3")) { run = false; }
			
			System.out.println("���α׷� ����");
		}
	}
}
