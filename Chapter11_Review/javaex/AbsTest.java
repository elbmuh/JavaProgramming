/* 06. 추상 클래스(Abstract Class)
 문제 : 
  키보드로부터 정수 2개(a, b)를 입력 받아 더하여 출력
  키보드로부터 5개의 정수 값을 입력 받아 배열에 저장하고 평균을 출력
  ArrayList로 5개의 정수 값을 입력 받아 저장하고 평균을 출력
  단, 추상 클래스와 추상 메서드를 만들어 처리한다.
*/
package javaex;
import java.util.ArrayList;

public abstract class AbsTest {
	abstract int add(int a, int b);  // 더하기
	abstract int mult(int a, int b); // 곱하기
	abstract double avg(int[] arr);  // 평균 구하기
	abstract double avg(ArrayList<Integer> arr);  // ArrayList로 처리
}