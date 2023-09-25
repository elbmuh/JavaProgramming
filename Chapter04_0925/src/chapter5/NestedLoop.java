package chapter5;

public class NestedLoop {
	public static void main(String[] args) {
		for (int i = 3; i < 8; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j);
				System.out.print('\t');
			}
			System.out.println();
		}
	}
}
