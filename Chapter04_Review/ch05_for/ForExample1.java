// for 문 예제 : 1 ~ 100 까지의 숫자 중 3의 배수만 출력하고, 그 합을 구해서 
// 아래와 같이 출력하는 프로그램을 작성하시오.
package ch05_for;

public class ForExample1 {
	public static void main(String[] args) {
		int i, sum = 0;
		
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
				System.out.print(i + "\t");
			}
		}
		
		System.out.println();
		System.out.println("3의 배수의 합: " + sum);
	}
}