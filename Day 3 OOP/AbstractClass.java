package day3;

public class AbstractClass {
	public static void main(String args[]) {
		Abst t = new Test();
		t.method();
	}

}

abstract class Abst{
	public abstract void method();
}

class Test extends Abst {
	public void method() {
		System.out.println("Test successful.");
	}
}