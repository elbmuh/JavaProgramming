package chapter6.q5;

public class CoffeeTest1 {
	public static void main(String[] args) {
		
		Person lee = new Person("Lee", 10000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		lee.buyStarCoffee(starCoffee, 4300);
		lee.buyBeanCoffee(beanCoffee, 4100);
	}
}