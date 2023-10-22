// while 문 예제
// while 문을 이용하여ㅏ 정수 여러 개를 입력 받고, 아래와 같이 평균을 출력한다.
// 단, -1이 입력되면 입력을 종료한다.
package chapter4;
import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		int count = 0; // 입력된 정수의 개수
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		int n = scanner.nextInt();
		
		while (n != -1) { // -1이 입력되면 while 문을 벗어난다.
			sum += n;
			count++;
			n = scanner.nextInt();
		}
		
		if (count == 0) System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은 " + (double)(sum/count) + "입니다.");
		}
	}
}