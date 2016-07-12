package JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile 

{

	public static void main(String[] args) 
	
	{
		
		BufferedReader br = null;
		
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("/home/bishop/workspace/test/test.txt"));
			while ((sCurrentLine = br.readLine()) != null) {System.out.println(sCurrentLine);} 
			} 
		
		catch (IOException e) {e.printStackTrace();}
		
		finally {try {if (br != null) br.close();} 
				 catch (IOException e2) {e2.printStackTrace();} }
		
	}
}

//in JDK 7, which use try-with-resources new feature to close file automatically.