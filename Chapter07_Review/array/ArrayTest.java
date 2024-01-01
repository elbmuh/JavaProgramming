// 01. 배열
// 배열 초기화하고 출력하기
package array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] number = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}