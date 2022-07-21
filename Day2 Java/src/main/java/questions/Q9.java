package questions;

public class Q9 {
	public static void main (String args[]) {
		int x;
		for(int i = 1; i <= 100; i++)
		{
			if(i == 2)
			{
				System.out.println(i);
				continue;
			}
			
			for(x = 2; x < i; x++)
			{
				if(i % x == 0)
				{
					break;
				}
			}
			if(x == i)
				System.out.println(i);
		}
		
		
	}

}
