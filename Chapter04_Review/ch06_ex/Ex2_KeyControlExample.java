// 연습문제 2
// while문과 Scanner의 nextLine() 메소드를 이용하여 키보드로부터 입력된 데이터로 1을 입력하면
// speed를 증가시키는 '증속', 2 입력시 speed를 감소시키는 '감속', 3 입력시 프로그램을 종료시키는 
// 프로그램을 작성하시오.
package ch06_ex;
import java.util.Scanner;

public class Ex2_KeyControlExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // 1, 2, 3 값 입력
		boolean run = true; // run 논리함수 값 초기화
		int speed = 10;     // speed 값울 10으로 초기화
		
		while (run) {
			System.out.println("--------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("--------------------------");
			System.out.print("선택: "); // 값 입력하는 화면을 출력
			
			String strNum = scn.nextLine();
			
			if (strNum.equals("1")) { 
				speed++;
				System.out.println("현재 속도 = " + speed); }
			
			else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed); }
			
			else if (strNum.equals("3")) { run = false;	}
		}
		
		System.out.println("프로그램 종료");
		scn.close();
	}
}