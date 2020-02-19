import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile
{
	public static void main(String args[])
	{
		try
		{
			FileWriter myWriter = new FileWriter("filename.txt"); // FileWriter is a standard class in Java
			myWriter.write("Learning file handling in java"); // .write() for writing data into file
			myWriter.close(); // .close() closes the file
			System.out.println("Successfully wrote to the file");
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace(); // prints information about where error have occured
		}
	}
}
