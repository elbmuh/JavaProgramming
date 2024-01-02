// 클래스에서 인터페이스 구현하기
package interfaceex;

public abstract class Calculator implements Calc { // 추상 클래스

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
}