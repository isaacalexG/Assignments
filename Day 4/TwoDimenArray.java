package day4;

public class TwoDimenArray {
	public static void main (String args[]) {
		int[][] arr = {{5,8,12},{3,7,1},{82,0,24}};

		for(int i = 0; i < arr.length; i++)
		{
			
			for(int x = 0; x < arr[i].length; x++)
			{
				System.out.print(arr[i][x] + " ");
			}
			System.out.println();
		}
	}
}
