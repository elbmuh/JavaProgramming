// 예제) 배열 개수만큼 숫자 입력하여 가장 큰 수 구하기
package array;
import java.util.Scanner;

public class ArrayExam2 {
	public static void main(String[] args) {
		int intArray[] = new int[5]; // 배열의 선언과 생성
		int max = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt(); // 키보드에서 입력 받은 정수 저장
			
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		scanner.close();
	}
}