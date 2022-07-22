package day3;

public class MethodOverload {
	
	public void method(){
		System.out.println("Method successful");	
	}
	
	public void method(int i){
		System.out.println(i);
	}
	
	public void method(int i, String s){
		System.out.println(s);
		System.out.println(i);
	}
	
	public static void main (String args[])
	{
		MethodOverload m = new MethodOverload();
		m.method();
		m.method(5);
		m.method(9, "New");
	}

}