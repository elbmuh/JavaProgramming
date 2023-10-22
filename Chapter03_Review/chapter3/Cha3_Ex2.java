// 연습문제 2
// 10이 짝수이면 'true', 그렇지 않으면 'false'가 출력되도록 
// 조건 연산자를 사용하여 ( ) 안의 코드를 완성하시오.
package chapter3;

public class Cha3_Ex2 {
	public static void main(String[] args) {
		int num = 10;
		boolean isEven;
		isEven = ((num % 2) == 0) ? true : false;
		System.out.println(isEven);
	}
}