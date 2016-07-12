package JavaIO;

import java.io.File;

public class TemporaryFile {

	public static void main(String[] args) {
		
		try 
		{
			File temp = File.createTempFile("temporary", ".tmp");
			System.out.println("this file:" + temp.getAbsolutePath());
			
		}
		
		catch (Exception e) {e.printStackTrace();}
	}
}
