package day3;

public class FinalKeyword {
	
}

final class Final {
	
}

class FinalMTest {
	final String str = "Final var";
	
	final void method() {
		str = "Var";
		System.out.println("Final method");
		System.out.println(str);
	}
}

class Test extends Final {
	
}

class Test2 extends FinalMTest {
	void method() {
		
	}
	
}