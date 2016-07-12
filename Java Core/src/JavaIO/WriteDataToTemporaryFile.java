package JavaIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteDataToTemporaryFile {

	public static void main(String[] args) {
		
		try 
		{
			File temp = File.createTempFile("test2", ".temp");
			
			BufferedWriter buf = new BufferedWriter(new FileWriter(temp));
			buf.write("content");
			buf.flush();
			buf.close();
			
			System.out.println("done");
		} 
		
		catch (Exception e) {e.printStackTrace();}
	}

}
