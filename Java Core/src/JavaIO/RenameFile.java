package JavaIO;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		
		File oldf = new File("/home/bishop/workspace/test/test.txt");
		File newf = new File("/home/bishop/workspace/test/newnewtest.txt");
		
		if (oldf.renameTo(newf)) {System.out.println("rename sucsesfully");}
		else System.out.println("rename fail");
	}

}
