package day3;

public class SuperKeyword {
	public static void main (String args[])
	{
		Car car = new Car();
		car.method();
		car.SMethod();
	}
}


class Vehicle {
	int speed = 0;
	Vehicle() {
		System.out.println("Vehicle constructor complete");
	}
	public void SMethod(){
		System.out.println("Superclass method");
	}
}

class Car extends Vehicle{
	int speed = 5;
	Car() {
		super();
		System.out.println("Car constructor complete");
	}
	
	void method() {
		System.out.println(speed);
		System.out.println(super.speed);
	}
	
	public void SMethod() {
		super.SMethod();
		System.out.println("Subclass method");
	}
}