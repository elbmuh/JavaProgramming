/*
05. 배열 응용 프로그램
 예제) Dog 클래스 만들기
 아래의 Dog 클래스를 제시된 조건에 맞게 코딩하여 아래와 같이 출력하도록 코딩하시오.
 조건 1: 배열 길이가 5인 Dog 배열을 생성 후, ArrayList에 추가하고 출력
 조건 2: for문과 for-each문을 활용하여 출력
*/
package chapter7.q4;

public class Dog {
	private String name;
	private String type;
	
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() { return name; }
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() { return type; }
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String showDogInfo() {
		return (name + "의 품종은 " + type + "이다.");
	}
}