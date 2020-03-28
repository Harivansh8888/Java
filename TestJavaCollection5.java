import java.util.*;

public class TestJavaCollection5 {
	public static void main(String args[]) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("Harivansh");
		q.add("Vishu");
		q.add("UPES");
		q.add("Dehradun");
		System.out.println("head:"+q.element());
		System.out.println("head:"+q.peek());
		System.out.println("Iterating the Queue elements:");
		Iterator itr = q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		q.remove();
		q.poll();
		System.out.println("after removing two elements:");
		Iterator itr2 = q.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
