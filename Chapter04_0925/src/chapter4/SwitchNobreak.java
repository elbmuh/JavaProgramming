package chapter4;

public class SwitchNobreak {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		System.out.println("���� �ð� : " + time + "��");
		
		switch (time) {
		case 8: System.out.println("��� �մϴ�.");     break;
		case 9: System.out.println("ȸ�Ǹ� �մϴ�.");    break;
		case 10: System.out.println("������ �մϴ�.");   break;
		default: System.out.println("�ܱ��� �����ϴ�."); break;
		}
	}
}
