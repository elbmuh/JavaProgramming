// Scanner 사용 데이터 입력 받기
// 본인의 이름과 나이를 입력 받아, 아래와 같이 출력하는 코딩을 작성하라.
package chapter4;
import java.util.*; // java의 util 안에 있는 모든 클래스를 가져다 쓰겠다.
					// import java.util.Scanner; 로 변경 가능

public class SwitchScannerEx1 {
	public static void main(String[] args) {
		int age;
		String name;
		
		Scanner scn = new Scanner(System.in);
		// new Scanner()를 활용하여 System.in 으로 들어온 
		// 사용자의 입력을 받고, 입력 받은 덩어리는 변수(scn)에 저장한다.
		
		System.out.println("이름을 입력하세요! : ");
		name = scn.nextLine();
		// scn.nextLine() : 사용자가 콘솔창에 입력한 값을 String(문자열) 타입으로 받아온다.
		// 'Enter' 키로 구분하여 한 줄 통째로 받아온다.
		
		System.out.println("나이를 입력하세요! : ");
		age = scn.nextInt();
		// scn.nextInt() : 사용자가 콘솔창에 입력한 값을 정수 타입으로 받아온다.
		
		System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살 입니다.");
	}
}