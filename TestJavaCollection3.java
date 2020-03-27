import java.util.*;

public class TestJavaCollection3 {
	public static void main(String args[]) {
		Vector<String> v = new Vector<String>();
		v.add("Kanpur");
		v.add("Delhi");
		v.add("Lucknow");
		v.add("Delhi");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
