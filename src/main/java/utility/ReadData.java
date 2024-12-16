package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
	public static String readPrpertyfile(String value) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\S.S\\eclipse-workspace\\WebAutomationTask\\src\\main\\java\\config\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
	}

}
