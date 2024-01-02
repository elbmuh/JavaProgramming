// 테스트 프로그램 구현하기
package booksh;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		// 순서대로 요소를 추가
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		
		System.out.print("처음 요소 개수: ");
		System.out.println(shelfQueue.getSize()); // 직접 추가
		
		// 입력 순서대로 요소를 꺼내어 출력
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.print("\ndeQueue() 후 요소 개수 : ");
		System.out.println(shelfQueue.getSize()); // 직접 추가
	}
}