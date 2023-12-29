// 01. this 예약어
// 자신의 메모리를 가리키는 this
package thisex;

class BirthDay {
	int day;
	int month;
	int year;
	
	// 태어난 연도를 지정하는 메소드
	public void setYear(int year) {
		this.year = year;
	}
	
	// this 출력 메소드
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		day.setYear(2000);		 // 태어난 연도를 2000으로 지정
		System.out.println(day); // 참조변수 출력
		day.printThis();		 // this 출력 메소드 호출
	}
}