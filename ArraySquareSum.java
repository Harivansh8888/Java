import java.util.Scanner;
class ArraySquareSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] Array = new int[10];
		int[] ArraySquare = new int[10];
		int sum = 0;
		for(int i = 0;i <10;i++)
		{
			Array[i] = sc.nextInt();
		}
		for(int i = 0;i <10;i++)
		{
			ArraySquare[i] = Array[i] * Array[i];
		}
		for(int i = 0;i <10;i++)
		{
			sum = sum + ArraySquare[i];
		}
		System.out.println("SUM : " + sum);
	}
}