// 새로운 고객 등급(GOLE) 추가하기
package witharraylist;

public class GoldCustomer extends Customer {
	double saleRatio;
	// float의 정밀도 보다 더 높은 정밀도가 필요하면, double를 사용한다.
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	// 재정의된 calcPrice() 메서드
	// calcPrice() 메서도 : bonusPoint를 계산한 후, '(가격) - (세일가격)' 을 반환함.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (price - (int)(price * saleRatio));
	}
}