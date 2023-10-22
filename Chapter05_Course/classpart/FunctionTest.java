package classpart;

import java.util.Scanner;
public class FunctionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요! : ");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요! : ");
		int num2 = scanner.nextInt();
		
		int sum = subNum(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + sum + " 입니다.");
	}
	
	public static int subNum(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
}
