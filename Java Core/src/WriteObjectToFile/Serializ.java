package WriteObjectToFile;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializ {

	public static void main(String[] args) {
		
	Serializ ser = new Serializ();
	ser.serializeAddres("wall street", "U country");

	}

	public void serializeAddres(String street, String country)
	{
		Adress address = new Adress();
		address.setStreet(street);
		address.setCountry(country);
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("/home/bishop/workspace/test/address.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(address);
			oos.flush();
			oos.close();
			
			System.out.println("done");
		} 
		catch (Exception e) {e.printStackTrace();}
	}
	
}
