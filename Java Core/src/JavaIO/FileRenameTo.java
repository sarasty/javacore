package JavaIO;

import java.io.File;
//файл перемещается 

public class FileRenameTo {

	public static void main(String[] args) {
		
		try 
		{
			File afile = new File ("/home/bishop/workspace/test/bfile.txt");
			
			if (afile.renameTo(new File("/home/bishop/workspace/" + afile.getName()))) 
			{System.out.println("file move");}
			else System.out.println("file not move");
			
		}
		
		catch (Exception e) {e.printStackTrace();}

	}

}
