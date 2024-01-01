// 01. 배열
// 객체 배열 만들기(1)
package array;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {} // 디폴트 생성자
	
	// 책 이름과 저자 이름을 매개변수로 받는 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// 책 이름을 저장하는 get(), set() 메서드
	public String getBookName() { return bookName; }
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	// 저자 이름을 저장하는 get(), set() 메서드
	public String getAuthor() { return author; }
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 책 정보를 출력하는 메서드
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
}