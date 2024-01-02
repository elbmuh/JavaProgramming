// 02. 인터페이스와 다형성
// 예제) 상담전화 배분정책 추가하기
// Scheduler 인터페이스 정의하기
package chapter10.scheduler;

public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}