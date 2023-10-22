// switch-case 문 예제 (Chap03 PPT 17 page)
// -> 등급에 따라 메달 색상을 아래와 같이 출력되도록 코딩 하시오.
package chapter4;

public class SwitchExample1 {
	public static void main(String[] args) {
		int rank = (int)(Math.random() * 4) + 1;
		char medalColor = 'A';
		
		switch (rank) {
		case 1 : medalColor = 'G'; break;
		case 2 : medalColor = 'S'; break;
		case 3 : medalColor = 'B'; break;
		case 4 : medalColor = 'A'; break;
		}
		
		System.out.println(rank + "등 메달의 색상은 " + medalColor + " 입니다.");
	}
}
