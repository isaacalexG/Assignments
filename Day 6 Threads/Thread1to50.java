package day6;

public class Thread1to50 {
	public static void main (String args[]) {
		Print p = new Print();
		p.start();
	}
}

class Print extends Thread{
	
	public void run() {
		for(int i = 0; i <= 50; i++) {
			System.out.println(i);
		}
	}
}