// if-else if-else 문
// 놀이공원 입장료 계산
// if-else 문과 if-if 문의 차이
// if-else 문은 현재 조건이 만족하면 이후 조건은 비교하지 않지만, if-if문은 조건마다 각각 비교한다.
package ifexample;

public class IfExample2 {
	public static void main(String[] args) {
		int age = 23;
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
		
		else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
	}
}