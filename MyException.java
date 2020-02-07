public class MyException
{
	public static void main(String args[])
	{
		try
		{
			int[] Array = {1,2,3,4,5,6};
			System.out.println(Array[8]);
		}
		catch (Exception e)
		{
			System.out.println("Something went Wrong !");
		}
	}
} 
