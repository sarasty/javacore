package JavaIO;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) 
	
	{		
		try {
			File file = new File ("/home/bishop/workspace/test/maya.txt");
			if (file.createNewFile()){System.out.println("file is created");}
			else {System.out.println("file already exists");}
			}
		catch (IOException e) {e.printStackTrace();}		
	}
}
