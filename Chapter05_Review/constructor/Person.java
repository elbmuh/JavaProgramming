// PPT 36~38p 생성자 만들기, 생성자 선언 및 활용
// PPT 39p 생성자 오버로드
// 오버로드 = 클래스에 생성자가 2개 이상 제공되는 경우
package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {}
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}

// 생성자: 클래스를 처음 만들 때 멤버변수나 상수를 초기화한다.
// 생성자는 클래스를 생성할 때에만 호출한다.
// 생성자 이름은 클래스 이름과 같고 반환값(return값)이 없다.