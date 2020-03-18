import java.util.regex.*;

public class RegexExample4 {
	public static void main(String atgs[]) {
		System.out.println("Metacharacter d");
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "443"));
		System.out.println(Pattern.matches("\\d", "323abc"));
		System.out.println("Metacharacter D");
		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "443"));
		System.out.println(Pattern.matches("\\D", "323abc"));
		System.out.println(Pattern.matches("\\D", "m"));
		System.out.println("Metacharacter D with Quantifier");
		System.out.println(Pattern.matches("\\D*", "abc"));
	}
}
