package Property_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropEx1 {
	
		public static Properties prop = new Properties();
		
		public static void readDataFromPropertiesFile(String propertyName) {
			
			try {
				FileInputStream file = new FileInputStream("src/main/java/Property_File/globalProperties.properties");
				
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String property = prop.getProperty(propertyName);
			
			System.out.println(property);
			System.out.println("------------------------------------------------------------------------------------");
		}
		
		public static void main(String[] args) {
			
			PropEx1.readDataFromPropertiesFile("TestEnvURL");
			PropEx1.readDataFromPropertiesFile("StagingEnvURL");
			PropEx1.readDataFromPropertiesFile("LiveEnvURL");
			PropEx1.readDataFromPropertiesFile("browser");
		}
		
}
