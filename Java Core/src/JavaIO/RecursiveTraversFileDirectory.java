package JavaIO;

import java.io.File;

public class RecursiveTraversFileDirectory {

	public static void main(String[] args) {
		displayIT(new File("/home/bishop/workspace/test/"));
	}

	public static void displayIT(File node){
		System.out.println(node.getAbsoluteFile());
		if(node.isDirectory())
		{
			String[] subNote = node.list();
			for(String filename : subNote) {displayIT(new File(node, filename));}
		}
	}	
}

//не совсем работает