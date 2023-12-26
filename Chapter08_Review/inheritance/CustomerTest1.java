package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customerJeon = new Customer();
		customerJeon.setCustomerID(10010);
		customerJeon.setCustomerName("전정국");
		customerJeon.bonusPoint = 1000;
		System.out.println(customerJeon.showCustomerInfo());
		
		VIPCustomer customerPark = new VIPCustomer();
		customerPark.setCustomerID(10020);
		customerPark.setCustomerName("박지민");
		customerPark.bonusPoint = 20000;
		System.out.println(customerPark.showCustomerInfo());
		
	}
}