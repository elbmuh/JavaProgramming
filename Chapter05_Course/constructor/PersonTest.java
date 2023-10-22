// PPT 41page
package constructor;

public class PersonTest {
	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F; 
		
		Person personLee = new Person("이순신", 175, 75);
		
		System.out.println("이름 : " + personKim.name);
		System.out.println("몸무게 : " + personKim.weight);
		System.out.println("키 : " + personKim.height);
		
		System.out.println("이름 : " + personLee.name);
		System.out.println("몸무게 : " + personLee.weight);
		System.out.println("키 : " + personLee.height);
	}
}

// overload(오버로드) : 클래스에 생성자가 2개 이상 제공되는 경우