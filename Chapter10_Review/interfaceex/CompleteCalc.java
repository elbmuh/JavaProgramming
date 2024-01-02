// 계산기 클래스 만들기
package interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0)
			return num1/num2;
		else 
			return Calc.ERROR; // num2 = 0 인 경우, 오류 반환
	}
	
	// CompleteCalc에서 추가로 구현한 메서드
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public int square(int num1) {
		return num1*num1;
	}
}