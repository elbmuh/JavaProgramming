// 테스트 프로그램 만들기
package interfacetwo;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// Customer 클래스 형인 customer를 Buy 인터페이스 형인 buyer에
		// 대입하여 변환. buyer는 Buy 인터페이스의 메스드를 호출 가능
		Buy buyer = customer;
		buyer.buy();
		buyer.order(); // 재정의된 메서드 호출
		
		// Customer 클래스 형인 customer를 Sell 인터페이스 형인 seller에
		// 대입하여 변환. seller는 Sell 인터페이스의 메서드를 호출 가능
		Sell seller = customer;
		seller.sell();
		seller.order(); // 재정의된 메서드 호출
		
		if (seller instanceof Customer) {
			// instanceof : 객체 타입을 확인하는 연산자
			Customer customer2 = (Customer)seller;
			// -> seller를 하위 클래스 형인 Customer로 다시 형 변환
			customer2.buy();
			customer2.sell();
		}
	}
}