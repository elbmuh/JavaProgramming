package chapter4;

import java.util.Scanner;
public class SwitchOper_scanner {
	public static void main(String[] args) {
		int jumsu = 0;
		String dept;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		dept = scanner.nextLine();
		
		System.out.print("������ �Է��ϼ��� : ");
		jumsu = scanner.nextInt();
		
		// �а� ����
		switch (dept) {
		case "�ΰ����ɰ��а�" : System.out.println("�к� : " + dept); break;
		case "��ǻ�Ͱ��а�" : System.out.println("�к� : " + dept);  break;
		case "������Ű��а�" : System.out.println("�к� : " + dept); break;
		default: System.out.println("�к� : " + dept);
		}
		
		// ���� ���
		// case �� �ʹ� ������, �׷��� 10���� ����
		switch (jumsu/10) { 
			case 10:
			case 9:	System.out.print("����� ������ A�Դϴ�."); break;
			case 8: System.out.print("����� ������ B�Դϴ�."); break;
			case 7: System.out.print("����� ������ C�Դϴ�."); break;
			case 6: System.out.print("����� ������ D�Դϴ�."); break;
			default: System.out.print("����� ������ F�Դϴ�.");
		}
	
		scanner.close();
	}
}
