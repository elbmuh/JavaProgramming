// 04. ArrayList 클래스 사용하기
// ArrayList 클래스 예제
package array;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("제인 에어", "샬롯 브론테"));
		library.add(new Book("폭풍의 언덕", "에밀리 브론테"));
		library.add(new Book("하이디", "요한나 슈피리"));
		library.add(new Book("소공녀", "프랜시스 호지슨 버넷"));
		library.add(new Book("데미안", "헤르만 헤세"));
		
		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=== for-each문 사용 ===");
		for (Book book : library) {
			book.showBookInfo();
		}
	}
}