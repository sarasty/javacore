package JavaIO;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileLastModified {

	public static void main(String[] args) {
		
		
		File file = new File("/home/bishop/workspace/test/newfile.txt");
		
		System.out.println("Before Format : " + file.lastModified());
	    	
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			
		System.out.println("After Format : " + sdf.format(file.lastModified()));
	    
	}

}
//обращается не к тому ?