// do-while 문 : { } 안의 문장을 무조건 1번 수행한 후, 조건식을 검사한다.
// -> { } 안의 문장이 1번은 수행된다.
package chapter5;

public class DoWhileEx1 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while (num <= 10);
		
		System.out.println("1~10 합 : " + sum);
	}
}