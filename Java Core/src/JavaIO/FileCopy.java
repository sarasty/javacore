package JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		
		
		try 
		{
			File afile = new File ("/home/bishop/workspace/test/newnewtest.txt");
			File bfile = new File ("/home/bishop/workspace/test/bfile.txt");
			
			InputStream is = new FileInputStream(afile);
			OutputStream os = new FileOutputStream(bfile); 
			
			byte[] buffer = new byte[1024];
			int lenght;
			
			while((lenght = is.read(buffer)) > 0) os.write(buffer, 0, lenght);
			is.close();
			os.close();
			System.out.println("finish");
		} 
		
		catch (IOException e) {e.printStackTrace();}
	
	}	
}
