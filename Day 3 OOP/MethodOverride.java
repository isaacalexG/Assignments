package day3;

public class MethodOverride {
	
	public static void main (String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println(a.method());
		System.out.println(b.method());
		System.out.println(c.method());

	}
}

class Letter {
	int method() 
	{
		return 0;
	}
}

class A extends Letter{
	int method()
	{
		return 1;
	}
}

class B extends Letter{
	int method()
	{
		return 2;
	}
}

class C extends Letter{
	int method()
	{
		return 3;
	}
}