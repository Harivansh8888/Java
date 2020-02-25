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
	int ch = sc.nextInt();
	switch (ch)
	{
	case 1:
	sb.append("Java");
	System.out.println(sb);
	break;
	case 2:
	sb.insert(2,"Java");
	System.out.println(sb);
	break;
	case 3:
	sb.replace(1,3,"Java");
	System.out.println(sb);
	break;
	case 4:
	sb.delete(1,3);
	System.out.println(sb);
	break;
	case 5:
	sb.reverse();
	System.out.println(sb);
	break;
	default:
	System.out.println("Wrong Choice Entered !");
	break;
  }
}
