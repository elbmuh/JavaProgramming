package javaex;
import java.util.Scanner;

public class JavaArray {
	public static void main(String[] args) {
		Studentpro stupro = new Studentpro();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		project : for(;;) {
			System.out.println("\n[성적처리 프로젝트]");
			System.out.println("[1] 입력");
			System.out.println("[2] 전체 출력");
			System.out.println("[3] 검색");
			System.out.println("[4] 삭제");
			System.out.println("[5] 수정");
			System.out.println("[6] 오름차순 출력");
			System.out.println("[0] 종료");
			System.out.print("메뉴 선택 >> ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				stupro.insert();
				break;
				
			case 2 :
				stupro.titleprint();
				stupro.print();
				break;
				
			case 3 : 
				System.out.print("검색하고자 하는 번호를 입력하세요 : ");
				num = sc.nextInt();
				stupro.search(num);
				break;
				
			case 4 :
				System.out.print("삭제하고자 하는 번호를 입력하세요 : ");
				num = sc.nextInt();
				Boolean 촤 = stupro.delete(num);
				
				if (촤) { System.out.println(num + "번 삭제 완료됨!!"); }
				else {
					System.out.println(num + "번 삭제 완료됨!!");
				}
				
				break;
				
			case 5 :
				System.out.print("수정하고자 하는 번호를 입력하세요 : ");
				num = sc.nextInt();
				int modifyChk = stupro.modify(num);
				if (modifyChk == 0) {
					System.out.println(num + "번 데이터 수정이 완료되었습니다.");
				}
				
				else if (modifyChk == 1) {
					System.out.println("수정 취소되었습니다.");
				}
				
				else if (modifyChk == 2) {
					System.out.println("원하는 데이터 없음");
				}
				
				break;
				
			case 6 :
				stupro.ascending();
				break;
				
			case 0 :
				System.out.println("프로그램이 종료되었습니다.");
				break project;
				
			default : 
				System.out.print("\n[메뉴에서 선택해주세요.]");
				continue;
			}
		}
		sc.close();
	}
}