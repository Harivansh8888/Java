import java.util.*;

public class TestJavaCollection6 {
	public static void main(String args[]) {
		Deque<String> d = new ArrayDeque<String>();
		d.add("Harsh");
		d.add("Harmit");
		d.add("Abhishek");
		d.add("Gautam");
		
		for(String str : d) {
			System.out.println(str);
		}
	}
}
