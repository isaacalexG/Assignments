package day4;

public class IntArray {
	public static void main (String args[]) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int evenSum = 0;
		int oddSum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
				evenSum += arr[i];
			else
				oddSum += arr[i];
		}
		System.out.println("Sum of evens: " + evenSum);
		System.out.println("Sum of odds: " + oddSum);

	}
}
