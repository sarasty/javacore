package ReadObjectInFile;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import WriteObjectToFile.Adress;

public class Deserializer {

	public static void main(String[] args) {
		
		   Deserializer deserializer = new Deserializer();
		   Adress address = deserializer.deserialzeAddress();
		   System.out.println(address);
	   }

	public Adress deserialzeAddress(){
		   
		   Adress address;
		 
		   try{
			    
			   FileInputStream fin = new FileInputStream("/home/bishop/workspace/test/address.txt");
			   ObjectInputStream ois = new ObjectInputStream(fin);
			   address = (Adress) ois.readObject();
			   ois.close();
			  
			   return address;
			   
		   }catch(Exception ex){ex.printStackTrace();
			   return null;} 
	   } 
	}