package Property_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_Property {
	
	Properties properties;
	String path = "src/main/java/Property_File/config.properties";	
	public Read_Property() throws IOException
	{
		properties = new Properties();
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
	}
	public String getURL()
	{
		String url = properties.getProperty("url");
		return url;
	}
	public String getUsername()
	{
		String username = properties.getProperty("username");
		return username;
	}
	public String getPassword()
	{
		String password = properties.getProperty("password");
		return password;
	}
	
}
