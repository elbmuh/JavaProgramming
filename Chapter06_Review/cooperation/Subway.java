// 지하철 클래스 구현하기
package cooperation;

public class Subway {
	String lineNumber;  // 지하철 노선 번호
	int passengerCount; // 승객 수
	int money;			// 지하철 수입
	
	// 지하철 노선 초기화
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 승객이 지하철 탄 경우를 구현한 메서드
	public void take(int money) {
		this.money += money; // 지하철 수입 증가
		passengerCount++;	 // 승객 수 증가
	}
	
	// 지하철 정보를 출력하는 함수
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명 이고, 수입은 " +
	money + "원 입니다.");
	}
}