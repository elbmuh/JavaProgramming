// break 문 예제
// 1-50 까지의 정수를 난수로 발생하여 발생된 정수를 아래와 같이 출력하고,
// 정수 20이 발생되면 프로그램이 종료되도록 while문을 이용하여 코딩하시오.
package ch04_break;

public class BreakExample {
	public static void main(String[] args) {
		
		while (true) {
			int num = (int)(Math.random() * 50) + 1;
			System.out.println("발생된 정수 " + num);
			
			if (num == 20) { break; }
		}
		
		System.out.println("프로그램 종료");
	}
}