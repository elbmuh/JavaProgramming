package chapter4;

import java.util.*;
public class WhileSample {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ�, �������� -1�� �Է��ϼ���.");
		int n = scanner.nextInt(); // -1���� Ȯ���ϱ� ���� �Է�
		
		while (n != -1) {
			sum += n;
			count++;
			n = scanner.nextInt();
		}
		
		if (count == 0)
			System.out.println("�Էµ� ���� �����ϴ�.");

		else {
			System.out.print("������ ������ " + count + "�̸�,");
			System.out.println("����� "+ (double)(sum/count) + "�Դϴ�.");
		}
	}
}