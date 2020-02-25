import java.util.Scanner;

class StringBufferExample
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer("Hello");
	System.out.println("Originally the string is :" + sb);
	System.out.println("Enter Choice :");
	System.out.println("1.Append");
	System.out.println("2.Insert");
	System.out.println("3.Replace");
	System.out.println("4.Delete");
	System.out.println("5.Reverse");
  }
}
