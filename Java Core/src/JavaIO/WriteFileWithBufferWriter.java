package JavaIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileWithBufferWriter {

	public static void main(String[] args) {
		
		try 
		{
			String content = "fuck off";
			File file = new File("/home/bishop/workspace/test/test.txt");
			if (! file.exists()){file.createNewFile();}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(content);
			bw.flush();
			bw.close();
			System.out.println("Well Done");	
		} 		
		catch (Exception e) {e.printStackTrace();}
	}
}
