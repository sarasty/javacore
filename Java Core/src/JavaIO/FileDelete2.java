//недоделано

package JavaIO;

import java.io.File;
import java.io.FilenameFilter;

public class FileDelete2 {
	
	private static final String FILE_DIR = "/home/bishop/workspace/test/";
	private static final String FILE_EXT = ".txt";
	
	public static void main(String[] args) {
		
		
		public void deleteFile (String folder, String ext)
		{
			GenericExtFilter gef = new GenericExtFilter(ext);
			File dir = new File(folder);
			
		}
		public class GenericExtFilter implements FilenameFilter
		{
			private String ext;
			public GenericExtFilter (String ext)
				{
					this.ext = ext;
				}
			public boolean accept (File dir, String name)
				{
				return name.endsWith(ext);
				}
			//здесь один метод возвращающий строку
		}
		
	}

}
