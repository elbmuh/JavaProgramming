// switch-case 문 (Scanner 사용 데이터 입력받기 예제)
// 본인의 소속 학과와 점수를 입력 받아 아래와 같이 출력하는 코딩을 하시오.
package chapter4;
import java.util.Scanner;

public class SwtichOper_scanner {
	public static void main(String[] args) {
		String major;
		int grade;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("과를 입력하세요! : ");
		major = scn.nextLine();
		
		System.out.print("점수를 입력하세요! : ");
		grade = scn.nextInt();
		
		// 학과 선택
		System.out.print("학부 : ");
		switch (major) {
		case "인공지능공학과" : System.out.println(major); break;
		case "컴퓨터공학과"  : System.out.println(major); break;
		case "정보통신공학과" : System.out.println(major); break;
		default : System.out.println(major); break;
		}
		
		// 학점 계산
		switch (grade/10) {
		case 10 :
		case 9 : System.out.println("당신의 학점은 A입니다."); break;
		case 8 : System.out.println("당신의 학점은 B입니다."); break;
		case 7 : System.out.println("당신의 학점은 C입니다."); break;
		case 6 : System.out.println("당신의 학점은 D입니다."); break;
		default : System.out.println("당신의 학점은 F입니다."); break;
		}
		
		scn.close();
	}
}