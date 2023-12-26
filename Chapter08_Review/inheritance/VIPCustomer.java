package inheritance;

public class VIPCustomer extends Customer {
	
	private int agentID; // VIP 고객 상담원 아이디
	double saleRatio;		// 할인율
	
	public VIPCustomer() {
		// super(customerID, customerName); // 컴파일러가 자동으로 추가, 상위 클래스의 Customer()가 호출됨
		customerGrade = "VIP"; // VIP 고객 등급
		bonusRatio = 0.05;	   // 보너스 적립 5%
		saleRatio = 0.1;	   // 할인율 10%
		// System.out.println("VIPCustomer() 생성자 호출"); // 하위 클래스 생성할 때 콘솔 출력문
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 계산
		return price - (int)(price * saleRatio);
	}
	
}