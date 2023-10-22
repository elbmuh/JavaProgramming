// class Name : Increase_Decrease_Operator_Ex
package ch03_sec01;

public class I_D_O_Ex {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x=" + x);
		System.out.println("------------");
		
		y--;
		--y;
		System.out.println("y=" + y);
		System.out.println("------------");
		
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("------------");
		
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("------------");
		
		z = (++y) + (x++);
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}