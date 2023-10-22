// 비트 논리 연산자 예제 : 비트 단위로 논리 연산을 수행
// 2진수 0과 1로 저장되는 정수타입인 'byte, short, int, long'형만 피연산자 될 수 있음.
// 1. &(AND)연산자 : 두 비트가 모두 1인 경우만 1
// 2. |(OR)연산자  : 두 비트가 모두 0인 경우만 1
// 3. ^(XOR)연산자 : 두 비트가 다른 값이면 1
// 4. ~(반전:보수)연산자 : 비트 값을 0은 1로, 1은 0으로 바꿈.

package ch03_sec02;

public class BitLogicExample {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 + "&" + num2 + "=" + (num1&num2));
		System.out.println(num1 + "|" + num2 + "=" +(num1|num2));
		System.out.println(num1 + "^" + num2 + "=" + (num1^num2));
		System.out.println("~" + num2 + " = " + (~num2));
		System.out.println("-----------");
	}
}