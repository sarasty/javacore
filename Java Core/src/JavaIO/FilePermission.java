package JavaIO;

import java.io.File;
import java.io.IOException;

public class FilePermission {

	public static void main(String[] args) {
		
		try {
			File file = new File("/home/bishop/workspace/test/newfile.txt");
			if (file.exists())
				{
				//проверяем разрешения файла и выводим 
				System.out.println("is execute:" + file.canExecute());
				System.out.println("is write:" + file.canWrite());
				System.out.println("is read:" + file.canRead());
				}
			
				//устанавливаем разрешения на запрет
				file.setExecutable(false);
				file.setWritable(false);
				file.setReadable(false);
				
				//проверяем разрешения файла и выводим 
				System.out.println("is execute:" + file.canExecute());
				System.out.println("is write:" + file.canWrite());
				System.out.println("is read:" + file.canRead());
				
			if (file.createNewFile()) {System.out.println("file created");}
			else {System.out.println("file already exist");}
			
			
		} catch (IOException e) {e.printStackTrace();}
	}
}
