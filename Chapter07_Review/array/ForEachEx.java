package array;

public class ForEachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	// enum 이란? (출처 : https://limkydev.tistory.com/66)
	// 01. 클래스처럼 보이게 하는 상수
	// 02. 서로 관련있는 상수들끼리 모아 상수들을 대표할 수 있는 이름으로 타입을 정의하는 것
	// 03. Enum 클래스형을 기반으로 한 클래스형 선언
	
	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		int sum = 0;
		
		// for-each에서 k는 n[0], n[1], ..., n[4]로 반복
		for (int k : n) {
			System.out.print(k + " "); // 반복되는 k값 출력
			sum += k;				   // 합 구하기
		}
		System.out.println("합은 " + sum);
		
		
		// for-each에서 s는 names[0], names[1], ..., names[5]로 반복
		for (String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		// for-each에서 day는 월, 화, 수, 목, 금, 토, 일 값으로 반복
		for (Week day : Week.values()) {
			// values() : 해당 열거체의 모든 상수를 저장한 배열을 생성하여 반환하는 메소드
			// 자바의 모든 열거체에 컴파일러가 자동으로 추가해주는 메소드
			System.out.print(day + "요일 ");  // 월요일 화요일 ... 출력 
		}
		System.out.println();
	}
}