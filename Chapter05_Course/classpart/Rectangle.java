package classpart;

import java.util.Scanner; // java의 util 안에 있는 모든 클래스를 가져다 쓰겠다.
public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // 객체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		
		rect.width = scanner.nextInt(); // --> 여기 잘 알아두기
		// next(), nextLine(), nextInt(), nextDouble()
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		scanner.close();
	}
}
