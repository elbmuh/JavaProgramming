// 깊은 복사 deep copy
package array;

public class ObjectCopy3 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("제인 에어", "샬롯 브론테");
		bookArray1[1] = new Book("폭풍의 언덕", "에밀리 브론테");
		bookArray1[2] = new Book("바람과 함께 사라지다", "마가렛 미첼");
		
		// 객체 직접 생성
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// 각각의 요소를 복사
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		// 복사된 내용 확인
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		// bookArray1 의 내용 수정
		bookArray1[0].setBookName("소공녀");
		bookArray1[0].setAuthor("프랜시스 호지슨 버넷");
		
		// bookArray1 출력
		System.out.println("\n=== bookArray1 ===");
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		// bookArray2 출력
		System.out.println("\n=== bookArray2 ===");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
	}
}