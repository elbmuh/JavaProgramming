// 객체 배열 만들기(3)
package array;

public class BookArray2 {
	public static void main(String[] args) {
		// Book 클래스 형태로 객체 배열 선언
		Book[] library = new Book[5];
		
		// 인스턴스 생성 후 배열에 저장
		library[0] = new Book("데미안", "헤르만 헤세");
		library[1] = new Book("소공녀", "프랜시스 호지슨 버넷");
		library[2] = new Book("하이디", "요한나 슈피리");
		library[3] = new Book("제인 에어", "샬롯 브론테");
		library[4] = new Book("퓨처 셀프(2023)", "벤저민 하디");
		
		// Book 인스턴스를 저장한 메모리 공간 출력
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		// Book 인스턴스 멤버 출력
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
	}
}