package chapter5;

public class DoWhileSample {
	public static void main(String[] args) {
		char c = 'a';
		
		do {
			System.out.println(c + "�� �����ڵ� �� = " + (int)c);
			c = (char)((int)c + 1);
		} while (c <= 'z');
	}
}
