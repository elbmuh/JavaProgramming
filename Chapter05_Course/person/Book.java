package person;

public class Book { // 생성자
	String title;
	String author;
	
	public Book(String t) { // 생성자
		title = t;
		author = "작자미상";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리"); // 생성자 하나
		Book loveStory = new Book("춘향전"); // 생성자 하나
		// littlePrince, loveStory 는 각각 참조변수
		
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
