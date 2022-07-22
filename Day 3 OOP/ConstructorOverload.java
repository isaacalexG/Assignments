package day3;

public class ConstructorOverload {
	public ConstructorOverload(){
		
	}
	
	public ConstructorOverload(int i){
		
	}
	
	public ConstructorOverload(int i, String s){
		
	}
	
	public ConstructorOverload(int i, int x){
		
	}
	
	public static void main (String args[])
	{
		ConstructorOverload c0 = new ConstructorOverload();
		ConstructorOverload c1 = new ConstructorOverload(5);
		ConstructorOverload c2 = new ConstructorOverload(8, "Eight");
		ConstructorOverload c3= new ConstructorOverload(9, 24);

	}

}
