package chapter4;
// ���迡 ������ ���� !!!!!!

import java.util.*;
public class SwitchScannerEx1 {
	public static void main(String[] args) {
		int age = 0 ;
		String name;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���! : ");
		name = scn.nextLine();
		
		System.out.print("���̸� �Է��ϼ���! : ");
		age = scn.nextInt();
		
		System.out.println("�� �̸��� " + name + "�̰�, ���̴� " + age +
				"�� �Դϴ�.");
	}
}
