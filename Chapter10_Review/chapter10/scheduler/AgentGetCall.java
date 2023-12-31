// 상담원 본인이 필요할 때 가져오기
package chapter10.scheduler;

// 상담원 본인이 필요할 때, 가져오는 정책
public class AgentGetCall implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담원이 다음 전화 요청.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담원이 전화 상담을 가져갔습니다.");
	}
	
}