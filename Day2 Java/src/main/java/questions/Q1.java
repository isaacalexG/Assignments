package questions;

public class Q1 {
	public static void main (String args[])
	{
		int x = 1;
		int y = 6;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		System.out.println(x++);
		System.out.println(x--);
		
		if(x == y)
			System.out.println("same");
		if(x != y)
			System.out.println("different");
		
		if(x == 1 && y ==6)
			System.out.println("and");
		if(x == 5 || y == 6)
			System.out.println("or");
		
	}

}
