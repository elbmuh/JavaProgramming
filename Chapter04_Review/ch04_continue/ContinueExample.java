// continue문 ) 주로 if문과 함께 사용하며, 특정 조건을 만족하는 경우 continue문을 실행해서 
// 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다.
// for문, while문, do-while문에서만 사용한다. continue문이 실행되면 이들의 증감식 또는 조건식으로 바로 이동된다.
// 문제 : 1~100 사이의 수 중에서 짝수만 출력하고 홀수인 경우, 다음 반복으로 넘어가는 프로그램을 작성하라.
package ch04_continue;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { continue; }
			System.out.print(i + " ");
		}
	}
}