package chapter4;

import java.util.Scanner;
public class SwitchOper_scanner {
	public static void main(String[] args) {
		int jumsu = 0;
		String dept;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("과를 입력하세요 : ");
		dept = scanner.nextLine();
		
		System.out.print("점수를 입력하세요 : ");
		jumsu = scanner.nextInt();
		
		// 학과 선택
		switch (dept) {
		case "인공지능공학과" : System.out.println("학부 : " + dept); break;
		case "컴퓨터공학과" : System.out.println("학부 : " + dept);  break;
		case "정보통신공학과" : System.out.println("학부 : " + dept); break;
		default: System.out.println("학부 : " + dept);
		}
		
		// 학점 계산
		// case 가 너무 많아짐, 그래서 10으로 나눔
		switch (jumsu/10) { 
			case 10:
			case 9:	System.out.print("당신의 학점은 A입니다."); break;
			case 8: System.out.print("당신의 학점은 B입니다."); break;
			case 7: System.out.print("당신의 학점은 C입니다."); break;
			case 6: System.out.print("당신의 학점은 D입니다."); break;
			default: System.out.print("당신의 학점은 F입니다.");
		}
	
		scanner.close();
	}
}
