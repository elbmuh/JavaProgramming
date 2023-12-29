// 택시 클래스 구현하기
package cooperation;

public class Taxi {
	String companyName; // 택시 회사 이름
	int money;			// 택시의 수입
	
	// 회사 이름을 매개변수로 받는 생성자
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	// 승객이 낸 돈을 받는 함수
	public void take(int money) {
		this.money += money; // 택시의 수입 증가
	}
	
	// 택시 정보를 출력하는 함수
	public void showInfo() {
		System.out.println(companyName + " 택시 수입은 " + money + "원 입니다.");
	}
}