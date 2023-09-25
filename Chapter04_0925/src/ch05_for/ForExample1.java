package ch05_for;

public class ForExample1 {
	public static void main(String[] args) {
		int i, sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
				System.out.printf(i + "\t"); }
		}
		System.out.println();
		System.out.println("3의 배수의 합 : " + sum);
	}
}
