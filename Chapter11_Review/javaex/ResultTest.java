// 06. 추상 클래스(Abstract Class)
package javaex;

import java.util.ArrayList;

public class ResultTest extends AbsTest {

	@Override
	int add(int a, int b) {
		int result = a + b;
		return result;
	}

	@Override
	int mult(int a, int b) {
		int result = a * b;
		return result;
	}

	@Override
	double avg(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = (double)sum / arr.length;
		
		return avg;
	}

	@Override
	double avg(ArrayList<Integer> arr) {
		int sum = 0;
		for (Integer i : arr) {
			sum += i;
		}
		
		double avg = (double)sum / arr.size();
		return avg;
	}
	
}