// 03. 복합 연산자 : 조건 연산자
// 연산에 필요한 항의 개수가 3개로, 3항 연산자이다.
// 주어진 조건식이 참인 경우, 거짓인 경우에 따라 다른 결과값이 나온다.
// 조건식 ? 결과1(참) : 결과2(거짓)
package ch03_sec01;

public class OperatorEx4 {
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
	}
}

// < 연산자 우선 순위 >
// 1. 단항, 이항, 삼항 순
// 2. 산술, 관계, 논리, 대입 연산자 순
// 3. ()의 우선 순위가 가장 높음