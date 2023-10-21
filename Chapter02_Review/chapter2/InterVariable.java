// 자료형이 다른 정수끼리 더하면?
// 연산하기 전에 두 정수는 모두 int형으로 변환되어 저장된다.
// int형 : 정수의 기본형, 정수형, integer(정수)
package chapter2;

public class InterVariable {
	public static void main(String[] args) {
		short sVal = 10;
		byte bVal = 20;
		// byte (1byte, -128~127)
		// short (2byte, -32768~32767)
		
		System.out.println(sVal+bVal);
	}
}
