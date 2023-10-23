package chapter4;

public class SwitchExample1 {
	public static void main(String[] args) {
		int rank = (int)(Math.random()*4) + 1;
		String medalColor;
		
		switch (rank) {
		case 1: medalColor = "G";
				break;
		
		case 2: medalColor = "S";
				break;
				
		case 3: medalColor = "B";
				break;
				
		default: medalColor = "A";
		} 
		
		System.out.println(rank + "등 메달의 색상은 " + medalColor + "입니다.");
	}
}
