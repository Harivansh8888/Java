import java.util.Scanner;

public class Marks
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[10];
		int temp,i,j;
		System.out.println("Enter marks of 10 Subjects :");
		for (i=0;i<10;i++)
		{
			marks[i] = sc.nextInt();
		}
	}
}
