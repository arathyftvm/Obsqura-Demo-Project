package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtil {

	 public static String getproperty(String key) throws IOException
	 {
	  String filepath=System.getProperty("C:\\Users\\arath\\eclipse-workspace\\frameWorkObsqura\\src\\test\\resources\\variables.properties");
	  FileReader fileReader = new FileReader(filepath);
	  Properties properties = new Properties();
	  properties.load(fileReader);
	  return properties.getProperty(key);
	  
	  
	 }
}
