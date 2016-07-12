package JavaIO;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class TotalNumberLinesInFile {

	public static void main(String[] args) {
		
		try 
		{
			File file = new File("/home/bishop/workspace/test/list.txt");
			
			if (file.exists())
			{
				FileReader fl = new FileReader(file);
				LineNumberReader ln = new LineNumberReader(fl);
				int linenumber = 0;
				
					while (ln.readLine() != null) linenumber++;
					System.out.println("Total number:" + linenumber);
					ln.close();	
			}
			else System.out.println("file not found");
			
		}
		
		catch (Exception e) {e.printStackTrace();}
	}
}
