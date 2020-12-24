package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login_amazon;

public class Sequential {
	
	public static ChromeDriver driver;
	public static Login_amazon lp;

	@BeforeTest
	public void loginamazon()
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		lp = new Login_amazon(driver);
		a.moveToElement(lp.Hellosignin()).build().perform();
		lp.Signin().click();
		
		lp.Email().sendKeys("8124089046");
		lp.Continuenext().click();
		lp.Password().sendKeys("Rithu@123");
		lp.Signinsubmit().click();
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}
}
