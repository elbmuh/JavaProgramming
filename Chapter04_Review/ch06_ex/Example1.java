// 연습문제 1
// for문과 Math.random()메소드를 이용하여 100번을 1~100 사이의 난수를 발생한 후, 
// 발생된 난수가 짝수일때 그 값을 한 줄에 2칸씩 띄어 출력하고, 짝수가 몇 번 발생했는지 카운트한 다음, 
// 그 합을 구해서 아래와 같이 발생 횟수와 그 합을 출력하도록 프로그램을 작성하시오.
package ch06_ex;

public class Example1 {
	public static void main(String[] args) {
		int sum = 0, count = 0;
		
		for (int i = 1; i <= 100; i++) {
			int num = (int)(Math.random() * 99) + 1;
			// 1~100 사이 : 100-1+1 = 100
			// (Math.random() * (Max-Min+1)) + Min
			if (num % 2 == 0) {
				System.out.print(num + "  ");
				count++;
				sum += num;
			}
		}
		
		System.out.println("\n짝수 발생 횟수: " + count);
		System.out.println("짝수의 합: " + sum);
	}
}