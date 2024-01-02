// 06. 추상 클래스(Abstract Class)
package javaex;
import java.util.ArrayList;
import java.util.Scanner;

public class Java2Abstract {
	public static void main(String[] args) {
		ResultTest resulttest = new ResultTest();
		Scanner sc = new Scanner(System.in);
		
		// 키보드로부터 정수 2개(a, b)를 입력 받고 더하여 출력하시오.
		System.out.print("2개의 정수를 입력하세요 : ");
		int add1 = sc.nextInt();
		int add2 = sc.nextInt();
		int add = resulttest.add(add1, add2);
		System.out.println("정수 a와 b를 더한 값 : " + add + "\n");
		
		// 키보드로부터 정수  2개(a, b)를 입력 받고 곱하여 출력하시오.
		System.out.print("2개의 정수를 입력하세요 : ");
		int mult1 = sc.nextInt();
		int mult2 = sc.nextInt();
		int sub = resulttest.mult(mult1, mult2);
		System.out.println("정수 a와 b를 곱한 값 : " + sub + "\n");
		
		// 키보드로부터 5개의 정수 값을 입력 받아 배열에 저장하고 평균을 출력하시오.
		int[] arr = new int[5];
		System.out.print("5개의 정수를 입력하세요 : ");
		for (int i = 0; i < arr.length; i++) {
			int input = sc.nextInt();
			arr[i] = input;
		}
		
		double avg = resulttest.avg(arr);
		System.out.print("정수 5개의 평균값 : " + avg + "\n\n");
		
		// + ArrayList로 처리
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		System.out.print("5개의 정수를 입력하세요 : ");
		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			arr1.add(input);
		}
		
		avg = resulttest.avg(arr1);
		System.out.print("정수 5개의 평균값 : " + avg + "\n\n");
		
		sc.close();
	}
}