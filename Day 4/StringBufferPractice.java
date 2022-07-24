package day4;

public class StringBufferPractice {
	public static void main (String args[]) {
		String s = "buffer test";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.insert(5, "E"));
		System.out.println(sb.delete(4,9));
		System.out.println(sb.reverse());
		System.out.println(sb.append(" Test 2"));
	}
}
