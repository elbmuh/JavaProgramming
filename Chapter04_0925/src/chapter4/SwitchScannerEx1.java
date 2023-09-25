package chapter4;
// 시험에 무조건 나옴 !!!!!!

import java.util.*;
public class SwitchScannerEx1 {
	public static void main(String[] args) {
		int age = 0 ;
		String name;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("이름을 입력하세요! : ");
		name = scn.nextLine();
		
		System.out.print("나이를 입력하세요! : ");
		age = scn.nextInt();
		
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age +
				"살 입니다.");
	}
}
