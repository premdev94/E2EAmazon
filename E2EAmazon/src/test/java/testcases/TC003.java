package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Sequential;
import pages.Cart_amazon;
import pages.Logout_amazon;

public class TC003 extends Sequential{

	@Test
	public void Checkcartcountafter() throws InterruptedException {
		// TODO Auto-generated method stub
		Cart_amazon cp = new Cart_amazon(driver);
		cp.Cartclick().click();
		System.out.println(cp.Cartcount().getText());
		Assert.assertEquals(cp.Cartcount().getText(), "1");
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		Logout_amazon logoutpage = new Logout_amazon(driver);
		a.moveToElement(logoutpage.Hellosignout()).build().perform();
		logoutpage.Signout().click();
	}
}
