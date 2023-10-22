// while 문 : 조건식이 참일 경우, 반복 수행한다. -> 참이 아닐 경우, 수행이 안된다.
package chapter5;

public class WhileEx1 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println("1~10 합 : " + sum);
	}
}