// 02. 객체간 협력
// 예제) 사람(김씨, 이씨) 클래스 구현하기
package chapter6.q5;

public class Person {
	String name; // 이름
	int money;	 // 김씨, 이씨가 가지고 있는 돈
	
	// 김씨, 이씨 이름과 가진 돈을 매개변수로 받는 생성자
	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 김씨가 아메리카노를 마시고 4,000원을 지불하는 기능을 구현한 메서드
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(money);
		if (message != null) {
			this.money -= money;
			System.out.println(name + " 님이 " + money + "원 으로 " + message);
		}
	}
	
	// 이씨가 라떼를 마시고 4,500원을 지불하는 기능을 구현한 메서드
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(money);
		
		if (message != null) {
			this.money -= money;
			System.out.println(name + " 님이 " + money + "원 으로 " + message);
		}
	}
}