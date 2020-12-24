package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Sequential;

public class Login_amazon extends Sequential {

	public Login_amazon(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	By hellosignin=By.xpath("//*[text()='Hello, Sign in']");
	By signin=By.xpath("//*[text()='Sign in']");
	By email=By.id("ap_email");
	By continuenext=By.id("continue");
	By password=By.id("ap_password");
	By signinsubmit=By.id("signInSubmit");
	
	public WebElement Hellosignin()
	{
		return driver.findElement(hellosignin);	
	}
	
	public WebElement Signin()
	{
		return driver.findElement(signin);	
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);	
	}
	
	public WebElement Continuenext()
	{
		return driver.findElement(continuenext);	
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);	
	}
	
	public WebElement Signinsubmit()
	{
		return driver.findElement(signinsubmit);	
	}
}
