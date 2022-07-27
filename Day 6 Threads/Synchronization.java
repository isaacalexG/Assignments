package day6;

public class Synchronization {
	public static void main (String args[]) {
		SyncTest a = new SyncTest();
		ThreadSync ts = new ThreadSync(a);
		Thread t1 = new Thread(ts);
		Thread t2 = new Thread(ts);

		t1.start();
		t2.start();
		
	}

}

class ThreadSync implements Runnable{
	SyncTest s;
	public ThreadSync(SyncTest x) {
		s = x;
	}
	public void run() {
		s.SyncAdd(10);
	}
}


class SyncTest {
	int num;
	public SyncTest() {
		num = 0;
	}
	public synchronized void SyncAdd(int i) {
		num = num + i;
		System.out.println("New sum: " + num );
	}
	
}