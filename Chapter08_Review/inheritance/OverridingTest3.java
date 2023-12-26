package inheritance;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 30000;
		
		// Customer 인스턴스 생성
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이재훈");
		customerLee.bonusPoint = 1000;
		
		// VIPCustomer 인스턴스 생성
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김사랑");
		customerKim.bonusPoint = 10000;
		
		// VIPCustomer 인스턴스를 Customer 타입에 대입
		Customer vc = new VIPCustomer();
		vc.setCustomerID(10020);
		vc.setCustomerName("박보영");
		vc.bonusPoint = 20000;
		
		System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은 " + 
		customerLee.calcPrice(price) + "원 입니다.");
		
		System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + 
		customerKim.calcPrice(price) + "원 입니다.");
		
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(30000) + "원 입니다.");
	}
}