package ifelseexample;

public class Medal_switch {
	public static void main(String[] args) {
		int rank = (int)(Math.random()*4) + 1;
		String medalColor;
		
		if (rank == 1) { medalColor = "G";}
		else if (rank == 2) { medalColor = "S"; }
		else if (rank == 3) { medalColor = "B"; }
		else { medalColor = "A"; }
		
		System.out.println(rank + "�� �޴��� ������ " + medalColor + "�Դϴ�.");
	}
}
