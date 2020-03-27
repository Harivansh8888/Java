import java.util.*;

public class TestJavaCollection1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Harivansh");
		list.add("Maulik");
		list.add("HD");
		list.add("Ingit");
		list.add("HD");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
