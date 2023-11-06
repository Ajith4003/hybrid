package com.automation.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test_dataByproperty implements Freamwork

{
	public static  FileInputStream fils;
	public  static String getdata(String key)
	{
		try {
			 fils= new FileInputStream(PROPERT);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		Properties prof= new Properties();
try {
	prof.load(fils);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String valu = prof.getProperty(key);
return valu;
	
	}


}
