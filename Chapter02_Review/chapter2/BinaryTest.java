// 2장) 변수와 자료형
// 숫자 10을 10진수, 2진수, 8진수, 16진수로 출력

package chapter2;

public class BinaryTest {
	public static void main(String[] args) {
		int num = 10;      // Decimal, 10진수
		int bNum = 0B1010; // Binary,  2진수
		int oNum = 012;    // Octal,   8진수
		int hNum = 0XA;    // HexaDecimal, 16진수
		
		// 2진수  : 0b~~
		// 8진수  : 0~~
		// 16진수 : 0x~~
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
	}
}