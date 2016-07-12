package JavaIO;

import java.io.File;

public class DeleteTemporaryFileCorrectly {

	public static void main(String[] args) {
		
		/*Временный файл используется для хранения менее важные и временные данные, 
		 * которые всегда должны быть удалены, когда система была остановлена. 
		 * Лучше всего использовать File.deleteOnExit (), чтобы сделать это.
		 */
		
		try 
		{
			File temp = File.createTempFile("test3", ".temp");
			
			temp.deleteOnExit();
		} 
		
		catch (Exception e) {e.printStackTrace();}
	}
}
