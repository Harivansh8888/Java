import java.util.*;

public class TestJavaCollection9 {
	public static void main(String args[]) {
		SortedSet<String> set = new TreeSet<String>();
		set.add("Sanjeev");
		set.add("Anoop");
		set.add("Raj");
		set.add("Anoop");
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
