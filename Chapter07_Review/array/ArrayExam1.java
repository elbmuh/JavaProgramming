// 예제) 배열의 개수 만큼 숫자를 입력하여 합계와 평균 구하기
package array;
import java.util.Scanner;

public class ArrayExam1 {
	public static void main(String[] args) {
		int intArray[] = new int[5]; // 배열의 선언과 생성
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			// 키보드에서 입력 받은 정수 저장
		}
		
		for (int j = 0; j < intArray.length; j++) {
			sum += intArray[j];
			// 배열에 저장된 정수 값을 더하기
		}
		
		System.out.println("합계는 " + (double)sum);
		System.out.println("평균은 " + (double)sum/intArray.length);
		scanner.close();
	}
}