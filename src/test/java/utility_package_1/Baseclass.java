package utility_package_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

 
public class Baseclass {

	// constructor
		// methord for browser
		// methord for url
	public static WebDriver driver;
	public static Properties coldpro;
	
	public Baseclass() {
		
		try {
			FileInputStream coldfile= new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\configuration_package_1\\cold.properties");
			coldpro = new Properties();
			coldpro.load(coldfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("please check your code");
			e.printStackTrace();
		}
		
	}
	public void coldbrowser() {
	String Browser = coldpro.getProperty("ColdBrowser1");
	if (Browser.equalsIgnoreCase("edge browser")) {
		
		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/edgedriver/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	else if (Browser.equalsIgnoreCase("FF"));
		
	}


   public static void coldurl (String url) {
	driver.get(coldpro.getProperty("URLEB"));
}
}




