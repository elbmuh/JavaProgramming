// 문자 또는 유니코드(정수값) 입력 및 출력하기
// 대문자 A 아스키코드 값은 65. (이건 기본이다.)
// 대문자 Z 아스키코드 값은 90.
// 소문자 a 97, z 122

package chapter2;

public class CharacterEx1 {
	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); // 문자 출력
		System.out.println((int)ch1); // 문자에 해당하는 아스키코드 출력
		
		char ch2 = 122; // 유니코드(정수값) 입력
		System.out.println(ch2); // UNICODE에 해당하는 문자 출력
		
		int ch3 = 77;
		System.out.println(ch3); // UNICODE output
		System.out.println((char)ch3); // 유니코드에 해당하는 문자 출력
	}
}
