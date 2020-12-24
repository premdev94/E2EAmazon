package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Sequential;

public class Logout_amazon extends Sequential {

	public Logout_amazon(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	By hellosignout=By.xpath("//*[text()='Hello, Prem']");
	By signout=By.linkText("Sign Out");

	
	public WebElement Hellosignout()
	{
		return driver.findElement(hellosignout);	
	}
	
	public WebElement Signout()
	{
		return driver.findElement(signout);	
	}
}
