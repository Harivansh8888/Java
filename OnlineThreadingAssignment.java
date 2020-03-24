import java.lang.Thread;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Threading1 extends Thread
{
	double count = 0,countBuffer=0,countLine=0;
    String lineNumber = "";
    String filePath = "C:\\Users\\hp\\Desktop\\Document1.txt";
    BufferedReader br;
    String inputSearch = "java";
    String line = "" ;
    public void run() {
	try {
        br = new BufferedReader(new FileReader(filePath));
        try {
            	while((line = br.readLine()) != null)
            	{
            		countLine++;
            		System.out.println("Document 1 is :");
            		System.out.println(line);
            		String[] words = line.split(" ");

            		for (String word : words) {
            			if (word.equals(inputSearch)) {
            				count++;
            				countBuffer++;
            			}
            		}

            		if(countBuffer > 0)
            		{
            			countBuffer = 0;
            			lineNumber += countLine + ",";
            		}

            	}
            	System.out.println("Times found at--"+count);
            	System.out.println("Word found at--"+lineNumber);
            	br.close();
        	} 
       catch (IOException e) {
    	   e.printStackTrace();
       }
    } 
	catch (FileNotFoundException e) {
        e.printStackTrace();
    }
   }
}
class Threading2 extends Thread
{
	double count = 0,countBuffer=0,countLine=0;
    String lineNumber = "";
    String filePath = "C:\\Users\\hp\\Desktop\\Document2.txt";
    String line = "";
    BufferedReader br;
    String inputSearch = "harivansh";
    public void run() {
	try {
        br = new BufferedReader(new FileReader(filePath));
        try {
            while((line = br.readLine()) != null)
            {
                countLine++;
                System.out.println("Document 2 is :");
                System.out.println(line);
                String[] words = line.split(" ");

                for (String word : words) {
                  if (word.equals(inputSearch)) {
                    count++;
                    countBuffer++;
                  }
                }

                if(countBuffer > 0)
                {
                    countBuffer = 0;
                    lineNumber += countLine + ",";
                }

            }
            System.out.println("Times found at--"+count);
            System.out.println("Word found at--"+lineNumber);
            br.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    } 
	catch (FileNotFoundException e) {
        e.printStackTrace();
    }
   }
}

