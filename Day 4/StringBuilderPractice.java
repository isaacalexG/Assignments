package day4;

public class StringBuilderPractice {
	public static void main (String args[]) {
		StringBuilder sb = new StringBuilder("StringBuild");
		
		System.out.println(sb.append(" Test"));
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		System.out.println(sb.delete(0,7));
		


	}
}
