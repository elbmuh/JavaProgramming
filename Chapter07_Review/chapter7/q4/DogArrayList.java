// DogArrayList 클래스 구현 후, 결과 출력하기
package chapter7.q4;
import java.util.ArrayList;

public class DogArrayList {
	public static void main(String[] args) {
		
		ArrayList<Dog> list = new ArrayList<Dog>();
		
		list.add(new Dog("전밤", "도베르만 핀셔"));
		list.add(new Dog("구름", "말티즈"));
		list.add(new Dog("김연탄", "블랙탄 포메라니안"));
		list.add(new Dog("홀리", "푸들"));
		list.add(new Dog("미키", "시츄"));
		
		System.out.println("==== for문 활용 출력 ====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}
		
		System.out.println("\n==== for-each문 활용 출력 ====");
		for (Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}
	}
}