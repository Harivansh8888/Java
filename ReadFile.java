import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile
{
	public static void main(String args[])
	{
		try
		{
			File myObj = new File("filename.txt");
			Scanner myReader = new Scanner(myObj); //myReader is an object of Scanner Class which will read data from file
			while( myReader.hasNextLine()) //condition for reading data till the cursor reaches the end of file
			{
				String data = myReader.nextLine();
				System.out.println(data); 
			}
		myReader.close(); //closing the file from which data was read
		}
		catch (FileNotFoundException e)
		{
		 	System.out.println("An error occured");
			e.printStackTrace(); // displays where error occured in the program
		}
	}
}
