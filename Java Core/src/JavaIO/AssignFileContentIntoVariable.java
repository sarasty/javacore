package JavaIO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class AssignFileContentIntoVariable {

	public static void main(String[] args) {
		
		/*Most people will read the file content and assign to StringBuffer or String line by line. 
		 * Here’s another trick that may interest you – how to assign whole file content into a variable 
		 * with one Java’s statement, try it :)
		 */
		
		try 
		{
			DataInputStream dt = new DataInputStream(new FileInputStream("/home/bishop/workspace/test/list.txt"));
			byte[] dataIBytes = new byte[dt.available()];
			dt.readFully(dataIBytes);
			dt.close();
			
			String content = new String(dataIBytes,0,dataIBytes.length);
			System.out.println(content);
		} 
		
		catch (Exception e) {e.printStackTrace();}
	}

}
