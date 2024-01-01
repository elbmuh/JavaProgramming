// 얕은 복사 shallow copy
package array;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("데미안", "헤르만 헤세");
		bookArray1[1] = new Book("소공녀", "프랜시스 호지슨 버넷");
		bookArray1[2] = new Book("하이디", "요한나 슈피리");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("젊은 베르테르의 슬픔");
		bookArray1[0].setAuthor("요한 볼프강 폰 괴테");
		
		System.out.println("\n=== bookArray1 ===");
		for (int a = 0; a < bookArray1.length; a++) {
			bookArray1[a].showBookInfo();
		}
		
		System.out.println("\n=== bookArray2 ===");
		for (int b = 0; b < bookArray2.length; b++) {
			bookArray2[b].showBookInfo();
		}
	}
}