package property;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyExample {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:\\Users\\anjan\\eclipse-workspace\\PropertyExample\\src\\main\\resources\\login.properties");
		Properties p = new Properties();
		p.load(f);
		
		System.out.println("Username:" +p.getProperty("username"));
		System.out.println("Password:" +p.getProperty("password"));
	}

}
