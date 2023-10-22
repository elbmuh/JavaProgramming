// switch-case 문과 No break
package chapter4;

public class SwitchNobreak {
	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8; 
		System.out.println("현재 시간 : " + time + "시");
		
		switch (time) {
		case 8 : System.out.println("출근 합니다.");
		case 9 : System.out.println("회의를 합니다.");
		case 10 : System.out.println("업무를 합니다.");
		case 11 : System.out.println("외근을 나갑니다.");
		}
	}
}