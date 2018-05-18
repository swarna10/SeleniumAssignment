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
public class TestRegisterPage 
    extends BaseTest
{
   
	@Test(enabled=true)
	public void testingRegisterPage() throws InterruptedException {
		WebElement register=driver.findElement(By.linkText("Sign Up"));
		register.click();
		WebElement email=driver.findElement(By.id("name"));
		email.sendKeys("Mona1234@gmail.com");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Mona");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("pass@word");
		WebElement signup=driver.findElement(By.xpath("//*[@id=\"register\"]/form/p[4]/input"));
		signup.click();
		 Alert alert= driver.switchTo().alert();
		  alert.accept();
		  
		
	}
	
}
