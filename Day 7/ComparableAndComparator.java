package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparableAndComparator {

	public static void main(String[] args) {
		Object2 a = new Object2("rty", 5);
		Object2 b = new Object2("abc", 10);
		Object2 c = new Object2("iop", 8);
		
		List<Object2> test = new ArrayList<Object2>();
		test.add(a);
		test.add(b);
		test.add(c);
		
		for(Object2 o: test)
		{
			System.out.println(o.getName());
		}
		System.out.println();
		Collections.sort(test);
		for(Object2 o: test)
		{
			System.out.println(o.getName());
		}
		System.out.println("\n\n");

		
		List<Object2> test2 = new ArrayList<Object2>();
		test2.add(a);
		test2.add(b);
		test2.add(c);
		
		for(Object2 o: test2)
		{
			System.out.println(o.getName());
		}
		System.out.println();
		Collections.sort(test2, new NumComparator());
		for(Object2 o: test2)
		{
			System.out.println(o.getName() + " " + o.getNum());
		}
		
	}

}

class Object2 implements Comparable<Object2>{
	
	private int num;
	private String name;
	
	Object2(String s, int i) {
		this.num = i;
		this.name = s;
	}
	
	
	public int compareTo(Object2 o) {
		return this.name.compareTo(o.getName());
	}
	
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
	
}

class NumComparator implements Comparator<Object2>{
	public int compare(Object2 o1, Object2 o2) {
		if(o1.getNum() > o2.getNum())
			return 1;
		if (o1.getNum() < o2.getNum())
			return -1;
		return 0;
	}
	
}