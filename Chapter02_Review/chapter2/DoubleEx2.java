// 실수 자료형 (float, double)
// 부동 소수점 방식의 오류
// 1. 부동 소수점은 0을 표현할 수 없다.
// 2. 부동 소수점 방식에서는 약간의 오차가 발생할 수 있다.
package chapter2;

public class DoubleEx2 {
	public static void main(String[] args) {
		double dnum = 1;
		
		for (int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
		}
		
		System.out.println(dnum);
	}
}
// 결과 값이 1001은 아니다.
// 오차를 감수하더라도 넓은 범위의 수를 표현하기 위해 사용