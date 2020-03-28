import java.util.*;

public class TestJavaCollection8 {
	public static void main(String args[]) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
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
