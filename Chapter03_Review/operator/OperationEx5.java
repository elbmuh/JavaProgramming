// 02. 비트 연산자 : 비트 이동 연산자
// <<<, >>> 연산자 : 비트 이동은 동일한데 남은 공간을 무조건 부호와 상관없이 0으로 채운다.
package operator;

public class OperationEx5 {
	public static void main(String[] args) {
		int num = 0B00000101; // 5를 이진수로 나타냄(8비트),     10000101
		
		System.out.println(num);
		System.out.println(num << 2);  // move left,  2bit 00010100 (20)
		System.out.println(num >> 2);  // move right, 2bit 00000001 (1)
		System.out.println(num >>> 2); // move right, 2bit 00000001 (1)
		
		num = num << 2; // 왼쪽으로 2비트 이동한 값을 다시 num에 대입
		System.out.println(num);
	}
}
