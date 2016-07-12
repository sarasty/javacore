package JavaIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		FileOutputStream fop = null;
		File file;
		String conten = "I/m numb";
		
		try 
		{
			file = new File("/home/bishop/workspace/test/test.txt");
			fop = new FileOutputStream(file);
			
			if (! file.exists()) {file.createNewFile();}
			//зачем то переодим контент в байты
			byte[] contentInBytes = conten.getBytes();
			
			fop.write(contentInBytes);
			fop.flush();				//Метод flush вызывает принудительный сброс буфера вывода
			fop.close();
			
			System.out.println("Well Done");
		} 
		
		catch (IOException e) {e.printStackTrace();}
		finally 
		{
			try {if (fop != null){fop.close();}}
			catch (Exception e2) {e2.printStackTrace();}
		}
	}
}
