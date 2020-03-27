import java.util.*;

public class TestJavaCollection4 {
	public static void main(String args[]) {
		Stack<String> s = new Stack<String>();
		s.push("Maruti");
		s.push("Hyundai");
		s.push("Toyota");
		s.pop();
		s.push("Kia");
		s.push("Mahindra");
		s.pop();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
