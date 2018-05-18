package capstone.automation.CapstoneAutomation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class TestLoginPage 
    extends BaseTest
{
   
	@Test(enabled=true)
	public void testingLoginPage() throws InterruptedException {
		WebElement register=driver.findElement(By.linkText("Sign Up"));
		register.click();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Mona");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("pass@word");
		WebElement login=driver.findElement(By.xpath("//*[@id=\"login\"]/form/p[3]/input"));
		login.click();
		
		
		
	}
	
}
