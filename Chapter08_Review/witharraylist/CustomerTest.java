// 배열로 고객 5명을 구현하여 결과를 출력한다.
// 현재 고객 5명(VIP 1명, GOLE 2명, SILVER 2명)
// 이 고객들이 30,000원짜리 상품을 구매했을 때 결과 출력
package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		
		// ArrayList Add 속성을 사용해 객체 배열에 고객 추가
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		// for-each 문을 활용하여 고객 정보 출력
		System.out.println("====== 고객 정보 출력 ======");
		for (Customer customer:customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		// for-each 문을 활용하여 할인율과 보너스 포인트 계산 후, 출력
		System.out.println("\n====== 할인율과 보너스 포인트 계산 ======");
		
		int price = 30000;
		for (Customer customer:customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + 
			customer.bonusPoint + "점 입니다.");
		}
	}
}