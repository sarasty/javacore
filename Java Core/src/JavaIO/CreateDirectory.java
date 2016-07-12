package JavaIO;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {

	public static void main(String[] args) {
		
		//Java IO Example
		
		//one directory
		File file = new File("/home/bishop/workspace/test/test111");
		
		if (!file.exists()){if (file.mkdir()){System.out.println("Directory create");}
		else {System.out.println("fail");}}
		
		//multiple directories
		File file1 = new File("/home/bishop/workspace/test/test222/test333");
		
		if (!file1.exists()){if (file1.mkdirs()){System.out.println("Directory create");}
		else {System.out.println("fail");}}
		
		
		//Java NIO Example
		Path path = Paths.get("/home/bishop/workspace/test/test444");
		try
		{
		if (!Files.exists(path))
		{Files.createDirectory(path);}
		}
		catch (Exception e){e.printStackTrace();}

	}
}
