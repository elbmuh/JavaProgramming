// 문자열 타입
package chapter2;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업\t";
		System.out.println(str);
		System.out.println("나는");
		System.out.println("자바를");
		System.out.println("배웁니다.");
	}
}

// println : 출력하고 행을 바꿔라.
// print   : 출력하고 행은 바꾸지 마라.