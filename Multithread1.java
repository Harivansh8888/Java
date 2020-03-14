package threading;
import java.lang.Thread;

class Multithreaddemo extends Thread {
	
	
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
		}
		
		catch(Exception e)
		{
			System.out.println("Caught an Exception !");
		}
	}
}



public class Multithread1 {
	public static void main(String args[]) {
		int n = 10;
		for (int i = 0;i < n;i++)
		{
			Multithreaddemo obj = new Multithreaddemo();
			obj.start();
		}
	}
}
