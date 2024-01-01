// 비정방향 배열 예제) 
// 주어진 배열 항목의 항목과 전제 합, 평균을 구해 출력하는 코드를 작성해보세요. (중첩 for문 이용)
package array;

public class SkewedArrayExam {
	// skewed : 비뚤어진
	
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88} };
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		avg = (double) sum / count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}