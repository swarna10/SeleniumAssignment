package capstone.automation.CapstoneAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 * Hello world!
 *
 */

public class BaseTest 
{
	ChromeDriver driver=null;
	
@BeforeTest
	public void openBrowser() {
	String driverpath;
	driverpath = System.getProperty("user.dir")+"/lib/chromedriver";
	  System.setProperty("webdriver.chrome.driver", driverpath);
	 driver = new ChromeDriver();
	 driver.get("http://localhost:4200/");
	 driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@AfterTest
public void closeBrowser()
{
	driver.close();
}
}
