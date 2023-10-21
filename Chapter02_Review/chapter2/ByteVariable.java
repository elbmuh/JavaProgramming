// 오류 표시가 뜬 이유는?
// byte 범위는 "-128 ~ 127"에 있기 때문에
// 오류가 뜬 부분은 주석 처리하고, -128, 127로 바꿔서 출력해본다.
package chapter2;

public class ByteVariable {
	public static void main(String[] args) {
		// byte bs1 = 128;
		// byte bs2 = -129;
		byte bs3 = 127;
		byte bs4 = -128;
		
		System.out.println(bs3);
		System.out.println(bs4);
	}
}
