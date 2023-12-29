// 02. 객체 간 협력
// 문제) 학생이 버스나 지하철을 타고 가는 상황을 코드로 구현하시오. +) 택시
// 첫번째, 학생 클래스 구현하기
package cooperation;

public class Student {
	String studentName; // 학생 이름
	int grade;			// 학년
	int money;			// 학생이 가지고 있는 돈
	
	// 이름과 돈을 초기화 하는 메소드
	// 학생 이름과 가진 돈을 매개변수로 받는 생성자 이다.
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 학생이 버스를 타면 1,000원을 지불하는 기능을 구현한 메소드
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	// 학생이 지하철을 타면 1,500원을 지불하는 기능을 구현한 메소드
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	// 학생의 현재 정보를 출력하는 함수
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}