package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Sequential;

public class Cart_amazon extends Sequential {

	public Cart_amazon(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	By clickcart=By.id("nav-cart");
	By cartcount=By.id("nav-cart-count");
	By deletecart=By.xpath("//input[@value='Delete']");
	By addtocart=By.id("add-to-cart-button");
	
	public WebElement Cartclick()
	{
		return driver.findElement(clickcart);	
	}
	
	public WebElement Cartcount()
	{
		return driver.findElement(cartcount);	
	}
	
	public WebElement Deletecart()
	{
		return driver.findElement(deletecart);	
	}
	
	public WebElement Addtocart()
	{
		return driver.findElement(addtocart);	
	}
}
