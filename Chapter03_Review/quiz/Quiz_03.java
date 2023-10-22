package quiz;

public class Quiz_03 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		boolean result;
		result = ((num1 > 10) && (num2 > 10)); // 논리곱 && : 하나만 틀려도 False
		// 첫 항부터 거짓임 False
		System.out.println(result); // A predicted value : false
		
		result = ((num1 > 10) || (num2 > 10)); // 논리합 || : 하나만 맞아도 True
		// 첫 항은 False, 끝 항은 True -> result = True
		System.out.println(result);  // true
		
		// True를 False로 출력, False를 True로 출력함.
		System.out.println(!result); // false 
	}
}