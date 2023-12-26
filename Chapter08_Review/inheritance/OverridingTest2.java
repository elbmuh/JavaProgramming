package inheritance;

public class OverridingTest2 {
	
	public static void main(String[] args) {
		
		Customer vc = new VIPCustomer();
		vc.setCustomerID(10030);
		vc.setCustomerName("강감찬");
		vc.bonusPoint = 1000;
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + 
		vc.calcPrice(30000) + "원 입니다.");
	}
}