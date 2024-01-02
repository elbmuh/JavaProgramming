// 우선순위에 따라 배분하기 : 
// 고객 등급에 따라 등급이 높은 고객의 전화를 우선 가져와서 업무 능력이 좋은 상담원에게 우선 배분
package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분합니다.");
	}
	
}