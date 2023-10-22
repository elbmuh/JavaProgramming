// do-while 문 예재
// 'a'부터 'z'까지 아스키코드 값을 아래와 같이 출력하는 프로그램을 작성하시오.
// a 97, z 122 (alphabet 총 26개) : 96+26 = 122
// A 65 , Z 90 -> 64+26 = 90
package chapter5;

public class DoWhileSample {
	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.println(c + "의 아스키코드값 = " + (int)c);
			c = (char)(c + 1);
		} while (c <= 'z');
	}
}