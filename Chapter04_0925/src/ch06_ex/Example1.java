package ch06_ex;

public class Example1 {
	public static void main(String[] args) {
		int sum = 0, count = 0;
		for (int i = 1; i <= 100; i++) { 
			int num = (int)(Math.random()*100) + 1;
			
			if (num % 2 == 0) {
				System.out.printf(num + "  ");
				count++;
				sum += num;
			}
		}
		
		System.out.println("\nÂ¦¼ö ¹ß»ý È½¼ö: " + count);
		System.out.println("Â¦¼öÀÇ ÇÕ: " + sum);
	}
}
