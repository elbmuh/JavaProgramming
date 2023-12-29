// 버스와 지하철과 택시 타기
package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		// 2명의 학생을 생성
		Student James = new Student("James", 5000);
		Student Tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		James.takeBus(bus100); // James가 100번 버스를 탐
		James.showInfo();	   // James 정보 출력
		bus100.showInfo();	   // 버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선");
		Tomas.takeSubway(subwayGreen); // Tomas가 2호선을 탐
		Tomas.showInfo();			   // Tomas 정보 출력
		subwayGreen.showInfo();
		
		Student Edward = new Student("Edward", 30000); // Edward 정보 생성
		Taxi taxi = new Taxi("잘간다 운수");
		Edward.takeTaxi(taxi); // Edward가 택시를 탐
		Edward.showInfo();	   // Edward 정보 출력
		taxi.showInfo();	   // 택시 정보 출력
	}
}