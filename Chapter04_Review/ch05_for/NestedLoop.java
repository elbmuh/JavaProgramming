// 중첩 for문 : for문 안에 또다른 for문 존재
package ch05_for;

public class NestedLoop {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.print(i+"단 : ");
			
			for (int j = 1; j < 10; j++) {
				System.out.print(i+"*"+j+"="+(i*j));
				System.out.print('\t');
			}
			
			System.out.println();
		}
	}
}