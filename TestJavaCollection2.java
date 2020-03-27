import java.util.*;

public class TestJavaCollection2 {
	public static void main(String args[]) {
		LinkedList<String> a = new LinkedList<String>();
		a.add("Facebook");
		a.add("Twitter");
		a.add("Instagram");
		a.add("Twitter");
		Iterator<String> itr = a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
