package day3;

public class Interface {
	public static void main (String args[])
	{
		X test = new X();
		test.method();
	}

}

interface I {
	String str = "value";
	int num = 9;
	void method();
	
}

class X implements I {
	public void method() {
		System.out.println(str);
		System.out.println(num);
	}
}