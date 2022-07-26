package day5;

public class UncheckedException {

	public static void main(String[] args) {
		int arr[] = {};
		
		try {
			System.out.println(arr[5]);
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

}
