package JavaIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.InputStreamReader;
public class utf8IntoFile {

	public static void main(String[] args) {
		
		try 
		{
			File file = new File("/home/bishop/workspace/test/newfile.txt");
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
			String str;
			
			while ((str = in.readLine()) != null){System.out.println(str);}
			in.close();
			
		} 
		catch (Exception e) {e.printStackTrace();}
	}

}
