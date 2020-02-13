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
		for (i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if (marks[i] > marks[j])
				{
					temp = marks[i];
					marks[i] = marks[j];
					marks[j] = temp;
				}
			}
		}
	}
}
