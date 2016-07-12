package JavaIO;

import java.io.File;
import java.io.IOException;

public class ConstructFilePath {

	public static void main(String[] args) {
		
		String fileName = "newTest.txt";
		String workingDirectory = "/home/bishop/workspace/test/";
	
		String absoluteFilePath = workingDirectory + System.getProperty("File.separator") + fileName;
		System.out.println("Final path:" + absoluteFilePath);
	
	try {	
		File file = new File(absoluteFilePath);
		if (file.createNewFile()){System.out.println("file is created");}
		else {System.out.println("file already exists");}
		}
	catch (IOException e) {e.printStackTrace();}		

	}

}
// почему имя начинается с нулл