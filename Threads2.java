import java.lang.Thread;

class Even extends Thread {
	Thread t = null;
	Even() {
		t = new Thread(this);
		start();
	}
	public void run() {
		try {
			System.out.println("Even Thread Running :");
			for(int i= 2;i<10;i=i+2) {
				System.out.println(i+" "+ Thread.currentThread().getClass());
				Thread.sleep(300);
			}
		}
		catch(Exception e) {
			System.out.println("Caught an Exception");
		}
	}
}

class Odd extends Thread {
	Thread t = null;
	Odd() {
		t = new Thread(this);
		start();
	}
	public void run() {
		try {
			System.out.println("Odd Thread Running :");
			for(int i= 1;i<10;i=i+2) {
				System.out.println(i+" "+  Thread.currentThread().getClass());
				Thread.sleep(300);
			}
		}
		catch(Exception e) {
			System.out.println("Caught an Exception");
		}
	}
}


public class Threads2 {
	public static void main(String args[]) {
		Even e = new Even();
		Odd o = new Odd();
	}
}
