package quiz;

public class Quiz_04 {
	public static void main(String[] args) {
		int num1 = 2;  // 2진수 : 0010
		int num2 = 10; // 2진수 : 1010
		
		System.out.println(num1 & num2); // & : 두 비트가 모두 1인 경우만 1
		System.out.println(num1 | num2); // | : 두 비트가 모두 0인 경우만 1
		System.out.println(num1 ^ num2); // ^ : 두 비트가 다른 값이면 1
	}
}

// result1 : 0010(이진수) = 2(10진수)
// result2 : 1010 = 5 가 아니라 10
// result3 : 1000 = 8