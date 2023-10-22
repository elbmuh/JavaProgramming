// 3장) 자바의 여러가지 연산자
// 01. 기본 연산자 : 부호 연산자
package ch03_sec01;

public class SignOperatorEx {
	public static void main(String[] args) {
		int num = 200;
		System.out.println(+num); // 값 200이 그대로 출력
		System.out.println(-num); // -200이 출력되지만 num값이 바뀐 것은 아님
		System.out.println(num);  // 값 200이 그대로 출력
		
		num = -num; // num값을 음수로 바꿔서 num에 대입
		System.out.println(num); // -200이 출력됨.
	}
}