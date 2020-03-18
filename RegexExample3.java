import java.util.regex.*;

public class RegexExample3 {
	public static void main(String args[]) {
		System.out.println("? Quantifier.......");
		System.out.println(Pattern.matches("[ayz]?", "a"));
		System.out.println(Pattern.matches("[ayz]?", "aaa"));
		System.out.println(Pattern.matches("[ayz]?", "ayyyyzz"));
		System.out.println(Pattern.matches("[ayz]?", "amnta"));
		System.out.println(Pattern.matches("[ayz]?", "ayz"));
		System.out.println("+ Quantifier.......");
		System.out.println(Pattern.matches("[ayz]+", "a"));
		System.out.println(Pattern.matches("[ayz]+", "aaa"));
		System.out.println(Pattern.matches("[ayz]+", "aayyyzz"));
		System.out.println(Pattern.matches("[ayz]+", "amnta"));
		System.out.println("* Quantifier.......");
		System.out.println(Pattern.matches("[ayz]*", "ayyyza"));
	}
}
