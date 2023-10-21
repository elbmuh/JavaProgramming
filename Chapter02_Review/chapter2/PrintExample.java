// 변수값 출력
package chapter2;

public class PrintExample {
	public static void main(String[] args) {
		int value = 5678;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%7d원\n", value);
		System.out.printf("상품의 가격:%-7d원\n", value);
		System.out.printf("상품의 가격:%07d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 10인 원의 넓이:%10.2f\n", area);
		
		String name = "이순신";
		String job = "장군";
		System.out.printf("%6d |%-7s|%6s", 1, name, job);
	}
}
