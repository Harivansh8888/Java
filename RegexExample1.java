import java.util.regex.*;

public class RegexExample1 {
	public static void main(String args[]) {
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("AxxB");
		System.out.println("String matches given regex - " + matcher.matches());
	}
}
