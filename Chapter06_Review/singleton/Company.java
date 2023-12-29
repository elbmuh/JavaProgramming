// 05. static 응용 (싱글톤 패턴)

// 싱글톤 패턴 이란?
// - 객체 지향 프로그램에서 인스턴스를 단 하나만 생성하는 디자인 패턴
// - static을 응용하여 프로그램에서 사용하는 인스턴스를 하나만 구현

// 예제 1) singleton 패턴으로 회사 클래스 구현하기 (private 생성자 만들기)
// 예제 2) 외부에서 참조할 수 있는 public 메서드 만들기
package singleton;

public class Company {
	private static Company instance = new Company(); // 유일하게 생성한 인스턴스
	private Company() {}
	
	// 인스턴스를 외부에서 참조할 수 있도록 public get() 메서드 구현
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		
		return instance; // 유일하게 생성된 인스턴스 반환
	}
}