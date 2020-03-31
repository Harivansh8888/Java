import java.util.*;

public class MapExample1 {
	public static void main(String args[]) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(43, "Harivansh");
		map.put(45, "Harshil");
		map.put(47, "Hridyanshu");
		map.put(48, "Ingit");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
