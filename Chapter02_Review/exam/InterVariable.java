// 오류가 뜬 부분을 주석 표시하고, 수정하여 출력하시오.
// 정수 기본형은 int형이다.
// 숫자가 길 때, long형을 선언하고, 변수 뒤에 대문자 L을 붙여야 한다.

package exam;

public class InterVariable {
	public static void main(String[] args) {
		// int num = 12345678900;
		// long num1 = 12345678900;
		long num2 = 12345678900L;
		
		// int (4byte, -147483648~2147483647) 최대 10자리
		// long (8byte, 2147483647) 최대 10자리?
		// --- 수정 후 ---
		long num = 12345678900L;
		long num1 = 12345678900L;
		
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
	}
}
