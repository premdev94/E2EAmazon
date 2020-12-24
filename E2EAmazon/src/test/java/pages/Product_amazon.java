package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Sequential;

public class Product_amazon extends Sequential {

	public Product_amazon(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.id("twotabsearchtextbox");
	By productbrand=By.xpath("//*[text()='MI']");
	By productmi=By.xpath("//*[text()='Mi Soundbar with 8 Speaker Drivers (White)']");
	By producttitle=By.id("productTitle");
	By productquantity=By.id("quantity");
	
	public WebElement Search()
	{
		return driver.findElement(search);	
	}
	
	public WebElement Productbrand()
	{
		return driver.findElement(productbrand);	
	}
	
	public WebElement ProductMI()
	{
		return driver.findElement(productmi);	
	}
	
	public WebElement Producttitle()
	{
		return driver.findElement(producttitle);	
	}
	
	public WebElement Productquantity()
	{
		return driver.findElement(productquantity);	
	}
}
