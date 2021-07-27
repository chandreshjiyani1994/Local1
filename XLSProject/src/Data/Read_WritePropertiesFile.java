package Data;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_WritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fs = new FileInputStream("D:\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		  String s = prop.getProperty("browser"); 
		  System.out.println(s); 
		  System.out.println(prop.getProperty("browser")); 
		  System.out.println(prop.getProperty("environment")); 
		  System.out.println(prop.getProperty("url")); 
		  System.out.println(prop.getProperty("correctEmail")); 
		  
		  FileOutputStream fo = new FileOutputStream("D:\\testing\\prop.properties"); 
		  prop.store(fo, "Adding other values to properties file");
		  
		  prop.setProperty("tool", "selenium"); 
		  System.out.println(prop.getProperty("tool"));
		  prop.setProperty("automation", "Brampton"); 
		  System.out.println(prop.getProperty("automation")); 
		
		 }

}
