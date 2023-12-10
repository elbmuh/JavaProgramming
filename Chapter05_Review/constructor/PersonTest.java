// PPT 36~38p 생성자 만들기, 생성자 선언 및 활용
// PPT 40p 생성자 오버로드) 테스트 클래스 구현하기
package constructor;

public class PersonTest {
	public static void main(String[] args) {
		// 디폴트 생성자로 클래스를 생성한 후 인스턴스 변수값을 따로 초기화
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.height = 180.0F;
		personKim.weight = 85.5F;
		
		
		// 인스턴스 변수 초기화와 동시에 클래스 생성
		Person personLee = new Person("이순신", 175, 75);
		
		
		System.out.println("이름 : " + personKim.name);
		System.out.println("몸무게 : " + personKim.weight);
		System.out.println("키 : " + personKim.height);
		
		System.out.println("이름 : " + personLee.name);
		System.out.println("몸무게 : " + personLee.weight);
		System.out.println("키 : " + personLee.height);
	}
}