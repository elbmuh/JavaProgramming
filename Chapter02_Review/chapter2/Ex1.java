// 형 변환 복습
// 다음 코드를 주석에 맞게 수정하여 보시오.
package chapter2;

public class Ex1 {
	public static void main(String[] args) {
		char ch1 = 'A'; // ASCII Code : A 65, Z 90 / a 97, z 122
		System.out.println((int)ch1); // 문자에 해당하는 정수값 출력
		
		int ch2 = 67; // A 65, B 66, C 67
		System.out.println((char)ch2); // 정수값에 해당하는 문자 출력
		
		int ch3 = 123;
		System.out.println((double)ch3); // 123.0으로 출력
	}
}