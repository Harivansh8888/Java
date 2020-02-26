import java.util.ArrayList;
import java.util.Scanner;

public class Wrapper3
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	Integer myInt = sc.nextInt();
	String myString = myInt.toString();
	System.out.println(myString.length());
	}
}