// 01. this() 예약어
// this()를 사용하여 주소값 반환하기
package thisex;

class Person {
	String name;
	int age;
	
	Person() {
		this("이름없음", 1); // Person(String, int)
		// this()를 사용해 Person(String, int) 생성자 호출
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		System.out.println();
		
		Person p = noName.returnSelf(); // this 값을 클래스 변수에 대입
		System.out.println(p);			// noName.returnSelf() 반환값 출력
		System.out.println(noName);		// 참초 변수 출력
	}
}