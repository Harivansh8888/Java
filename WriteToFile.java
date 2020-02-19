import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile
{
	public static void main(String args[])
	{
		try
		{
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Learning file handling in java");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}