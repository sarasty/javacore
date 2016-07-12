package JavaIO;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		
		try 
		{
			File file = new File("/home/bishop/workspace/test/test2.txt");
			if (file.delete()){System.out.println("File delete");}
			else System.out.println("file not delete");
		} 
		catch (Exception e) {e.printStackTrace();}
	}
}
