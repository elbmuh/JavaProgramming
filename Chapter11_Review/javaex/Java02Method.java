// 01. 메서드
// 문제 :
// 1) score[]에 저장되어 있는 값을 출력하는 메서드 print();를 만들어라. ([90, 100, 59, 28, 69])
// 2) 오름자순 (Ascending) 정렬하는 메서드 accSort();를 만들어라.
package javaex;
import java.util.Arrays;

public class Java02Method {
	static void print(int[] score) {
		System.out.println("오름차순 전 = " + Arrays.toString(score));
	}
	
	// 오름차순 정렬
	static void accSort(int[] score) {
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {
					int tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
					// i값을 j에, j값을 i에 저장
				}
			}
		}
		System.out.println("오름차순 후 = " + Arrays.toString(score));
	}
	
	public static void main(String[] args) {
		int score[] = {90, 100, 59, 28, 69};
		
		// score[]에 저장되어 있는 값을 출력하는 메서드 print();
		print(score);
		
		// 오름차순(Ascending) 정렬하는 메서드 accSort();
		accSort(score);
	}
}