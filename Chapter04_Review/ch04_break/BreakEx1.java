// 반복문 : break 문
// 조건식이 참일 경우 무한반복 수행 시 break 문을 이용해 탈출한다.
// for문, while문, do-while문에서 실행을 중지할 때 사용
// "exit"이 입력되면, while문을 벗어나도록 break문을 활용하는 프로그램을 작성하라.
package ch04_break;
import java.util.*;

public class BreakEx1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료됩니다.");
		while (true) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			
			if (text.equals("exit")) {
				// 문자열 비교시 equals() 함수를 사용한다.
				// "exit"이 입력되면 반복을 종료한다.
				break; // while문을 벗어난다.
				}
		}
		
		System.out.println("종료합니다...");
		scanner.close();
	}
}