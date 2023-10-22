// 03. 복합 연산자 : 복합 대입 연산자 예제
// class Name : Assignment_Operator_Example
package ch03_sec01;

public class A_O_Example {
	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result = " + result);
		
		result -= 5;
		System.out.println("result = " + result);
		
		result *= 3;
		System.out.println("result = " + result);
		
		result /= 5;
		System.out.println("result = " + result);
		
		result %= 3;
		System.out.println("result = " + result);
	}
}
