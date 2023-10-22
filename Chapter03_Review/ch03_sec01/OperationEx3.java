// 단락 회로 평가 예제 (short circuit evaluation)
// 논리곱 && : 두 항이 모두 참이 되야 True 가능.
// 논리합 || : 하나의 항만 참이어도 True 가능.
// 부정 ! : 참인 경우 false, 거짓인 경우 true.
package ch03_sec01;

public class OperationEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		// && 논리곱) 하나는 false, 하나는 true -> 결과는 false
		// 논리곱에서 앞 항의 결과값이 거짓이므로 뒷 항은 실행되지 않음.
		
		System.out.println(value);
		System.out.println(num1); // num1 = 20
		System.out.println(i);    // i = 2 : 뒷 항이 실행되지 않아서 기본값
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		// || 논리합) 둘 다 true
		// 논리합에서 앞 항의 결과값이 참이므로 뒷 항은 실행되지 않음.
		System.out.println(value);
		System.out.println(num1); // num1 = 30
		System.out.println(i);    // i = 2 : 뒷 항이 실행되지 않아 값이 그대로임.
	}
}