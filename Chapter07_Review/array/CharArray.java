// 문자 저장 배열 만들기 (알파벳 문자와 아스키 코드 값 출력하기)
package array;

public class CharArray {
	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A'; // A = 65, a = 97 (알파벳 총 26개)
					   // 64+26 = 90 = Z, 96+26 = 122 = z
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch; // 아스키 값으로 각 요소에 저장
		}
		
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
	}
}