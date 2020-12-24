package testcases;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Sequential;
import pages.Cart_amazon;
import pages.Product_amazon;

public class TC002 extends Sequential{

	@Test
	public void Clickaddtocart() throws InterruptedException {
		// TODO Auto-generated method stub
		Product_amazon productpage = new Product_amazon(driver);
		WebElement search=productpage.Search();
		search.sendKeys("MI Tv");
		search.sendKeys(Keys.ENTER);
		//Thread.sleep(5000);
		productpage.Productbrand().click();
		
		productpage.ProductMI().click();
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String Parentid=it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		System.out.println(productpage.Producttitle().getText());
		//driver.findElementById("productTitle").sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Assert.assertEquals(productpage.Producttitle().getText(), "Mi Soundbar with 8 Speaker Drivers (White)");
		
		Select Quantity=new Select(productpage.Productquantity());
		Quantity.selectByVisibleText("2");
		Cart_amazon cp = new Cart_amazon(driver);
		cp.Addtocart().click();
		cp.Cartclick().click();
		System.out.println(cp.Cartcount().getText());
		Assert.assertEquals(cp.Cartcount().getText(), "2");
		Thread.sleep(5000);
		cp.Deletecart().click();
		driver.close();	
		driver.switchTo().window(Parentid);
	}
}
