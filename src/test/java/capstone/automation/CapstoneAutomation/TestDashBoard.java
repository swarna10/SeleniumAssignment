package capstone.automation.CapstoneAutomation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDashBoard 
    extends BaseTest
{
   
	@Test(enabled=true)
	public void testingDashBoardPage() throws InterruptedException {
		
		WebElement message=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[3]/div/app-message/div/div/div/input"));
		message.sendKeys("Hello Riya");
		WebElement send=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[3]/div/app-message/div/div/div/div/button/i"));
		send.click();
		WebElement group=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[1]/div[2]/a"));
		group.click();
		WebElement groupname=driver.findElement(By.xpath("//*[@id='registeropt']/form/div[2]/input"));
		groupname.sendKeys("HiFi");
		WebElement create=driver.findElement(By.xpath("//*[@id=\"registeropt\"]/form/div[2]/div/button[2]"));
		create.click();
		WebElement cancel=driver.findElement(By.xpath("//*[@id=\"registeropt\"]/form/div[2]/div/button[1]"));
		cancel.click();
		WebElement signout=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[1]/div[1]/span"));
		signout.click();

		
	}
	
}
