package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestNG {
	WebDriver driver;
	
	
	@Test
	@Parameters({"url","login"})
	public void login() {
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/mS/Documents/MonaQAjars/WebDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.quit();
	}
	
	
	
	
}
