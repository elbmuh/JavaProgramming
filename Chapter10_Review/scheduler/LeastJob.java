// 짧은 대기열 찾아 먼저 배분하기 :
// 고객 대기 시간 감소. 상담하지 않는 상담원 또는 가장 짧은 대기열을 보유한 상담원에게 배분
package scheduler;

// 현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 업무 배분
public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 가장 적은 상담원에게 할당합니다.");
	}
	
}