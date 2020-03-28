import java.util.*;

public class TestJavaCollection7 {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
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
