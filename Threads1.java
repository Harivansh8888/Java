import java.lang.Thread;


class ThreadDemo extends Thread {
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
		}
		catch(Exception e) {
			System.out.println("Caught an exception !!!");
		}
	}
}

public class Threads1 {
	public static void main(String args[]) {
		int n = 5;
		for (int i = 0;i<n;i++) {
			ThreadDemo obj = new ThreadDemo();
			obj.start();
		}
	}
}
