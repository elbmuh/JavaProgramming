// 04. 인터페이스 활용하기
// 한 클래스가 여러 인터페이스를 구현하는 경우
package interfacetwo;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("구매 주문");
	}
}