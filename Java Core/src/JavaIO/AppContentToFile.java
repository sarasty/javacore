package JavaIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppContentToFile {  //appened content to file

	public static void main(String[] args) {
		
		try 
		{
			String content = "its a new content";
			File file = new File ("/home/bishop/workspace/test/test2.txt");
			if (!file.exists()){file.createNewFile();}
		
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true); //второй аргумент позволяет включить
																//отключить дозаписывание к файлу
			BufferedWriter bf = new BufferedWriter(fw);
			bf.write(content);
			bf.flush();
			bf.close();
			
			System.out.println("Well done");
		} 
		catch (IOException e) {e.printStackTrace(); }
	}

}
