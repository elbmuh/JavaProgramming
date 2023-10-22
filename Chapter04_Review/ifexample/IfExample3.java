// 놀이공원 입장료 계산(응용 편)
// age조건이 65살 이상이면 '경로 우대입니다.', '입장료는 0원 입니다.'를 출력하도록 수정하라.
package ifexample;

public class IfExample3 {
	public static void main(String[] args) {
		int age = 101;
		int charge = 0;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		
		else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		
		else if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}
		
		else if (age >= 65) {
			charge = 0;
			System.out.println("경로 우대입니다.");
		}
		
		else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
	}
}