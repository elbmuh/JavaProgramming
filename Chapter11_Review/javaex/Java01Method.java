// 01. 메서드
// 문제 : 키보드 로부터 정수값 1개를 입력받아 1부터 정수값까지 합계를 구하는 add() 메서드를 만드시오.
package javaex;
import java.util.Scanner;

public class Java01Method {
	
	public static void sum() {
		System.out.println("sum() 메서드 호출");
	}
	
	// 합계 메서드
	public static int add(int score) {
		int addsum = 0;
		for (int i = 1; i <= score; i++) {
			addsum += i;
		}
		return addsum;
	}
			
	// 출력 메서드
	public static void printResult(int num, int sum) {
		System.out.println("1부터 " + num + "까지 합계 = " + sum);
	}
	
	public static void main(String[] args) {
		// 메서드 호출하기
		sum();
		
		// 키보드로부터 정수값 1개를 입력받아 1부터 정수값까지 합계를 구하는 add() 메서드
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1개 입력 : ");
		int num = sc.nextInt();
		sc.close();
		
		int sum = add(num);
		
		printResult(num, sum);
	}
}