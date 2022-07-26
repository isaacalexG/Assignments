package day5;

public class CustomException {

	public static void main(String[] args) {
		try {
			throw new Exception("Custom throw");
		}
		catch (Exception e){
			System.out.println("Exception caught: " + e);
		}

	}

}
