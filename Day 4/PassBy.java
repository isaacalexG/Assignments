package day4;

import java.sql.Ref;

public class PassBy {
	public static void main (String args[]) {
		Pass value = new Pass(6, 24);
		Pass reference = new Pass(6, 24);
		
		System.out.println(value.a + " " + value.b);
		value.byValue(6, 24);
		System.out.println(value.a + " " + value.b + "\n");
		
		System.out.println(reference.a + " " + reference.b);
		reference.byReference(reference);
		System.out.println(reference.a + " " + reference.b);

		
	}
}

class Pass {
	int a;
	int b;
	
	Pass(int x, int y) {
		a = x;
		b = y;
	}
	
	void byValue(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}
	
	void byReference(Pass r) {
		int temp;
		temp = r.a;
		r.a = r.b;
		r.b = temp;
		
	}
}