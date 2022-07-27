package day6;

public class TwoThreads {
	public static void main (String args[]) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		
		t1.start();
		t2.start();
	}
}

class ThreadA extends Thread{
	
	public void run() {
		for(int i = 0; i <= 50; i++) {
			if(i % 2 == 1)
				System.out.println(i);
		}
	}
}

class ThreadB extends Thread{
	
	public void run() {
		for(int i = 0; i <= 50; i++) {
			if(i % 2 == 0)
				System.out.println(i);
		}
	}
}