package weightWatchers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Weight_Watchers {

	  static String str="src/weightWatchers/FileExistsOrNot.txt";
	  static File fileExistsOrNot=new File(str);
	 public  static void doesFileExist(String path) throws IOException
	{

		 boolean exists = fileExistsOrNot.exists();
		 if(exists)
		 {
			 System.out.println("File exists");
		 }
		 else 
			 System.out.println("File DOES NOT exists"); 
		 
	}
	 
	 public static void getAllLines(File fileExistsOrNot) throws FileNotFoundException, IOException {
		    FileReader fr = new FileReader(fileExistsOrNot);
		    BufferedReader br = new BufferedReader(fr);
		    String buffer;
		    String fulltext="";
		    while ((buffer = br.readLine()) != null) {
		        String[] tokens = buffer.split(" - |, ");
		        for(String each:tokens )
		        {
		        	System.out.println(each);
		        }
		    	
		    	//System.out.println(buffer);
		        fulltext += buffer;
		    }
		    br.close();
		    fr.close();
		}
public static void main(String[] args) throws IOException
{
	
	doesFileExist(str);
	getAllLines(fileExistsOrNot);
	
}
}