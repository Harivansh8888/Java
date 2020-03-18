import java.util.regex.*;

public class RegexExample2 {
	public static void main(String args[]) {
		System.out.println(Pattern.matches("[xyz]", "abcd"));
		System.out.println(Pattern.matches("[xyz]", "x"));
		System.out.println(Pattern.matches("[xyz]", "xyyyz"));
	}
}
