// 형 변환 예제 : 자동 타입 변환과 강제 타입 변환의 이해
package chapter2;

public class TypeConversion {
	public static void main(String[] args) {
		float x = 15.6f;
		int y = (int)x; // 강제 형변환(자료 손실)-소수점 이하 값
		System.out.println("y=" + y);
		
		char c = 'A'; // 하나의 문자를 작은 따옴표('')로 감싼 것
		int cc = c;   // c = 'A' 아스키코드 값 A 65, Z 90
		// ASCII Code : a 97, z 122
		System.out.println("cc=" + cc); // 자동 형변환
		
		int dd = 5;
		double ddd = dd; // 자동 형변환
		System.out.println("ddd=" + ddd);
		
		double dx = 14.67;
		int dy = (int)dx; // 강제 형변환(소수점 이하 값: 자료 손실)
		System.out.println("dy=" + dy);
		
		// 결과값 추측
		// y=15\n cc=65\n ddd=5.0\n dy=14\n
	}
}
