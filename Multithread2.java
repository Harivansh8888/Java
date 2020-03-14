package threading;
import java.lang.Runnable;

class MultiThreadingDemo implements Runnable {
	public void run() {
		try {
			System.out.println("Thread is " + Thread.currentThread().getId() + " is running.");
		}
		
		catch(Exception e)
		{
			System.out.println("Caught an Exception !");
		}
	}
}


public class Multithread2 {
	public static void main(String args[])
	{
		int n = 10;
		for (int i = 0;i < n;i++)
		{
			Thread ob = new Thread(new MultiThreadingDemo());
			ob.start();
		}
	}
}
