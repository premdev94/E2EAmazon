package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Sequential;
import pages.Cart_amazon;
import pages.Login_amazon;

public class TC001 extends Sequential {
	


	@Test
	public void Checkcartcountbefore() throws InterruptedException {
		// TODO Auto-generated method stub
		Cart_amazon cp = new Cart_amazon(driver);
		System.out.println(cp.Cartcount().getText());
		Assert.assertEquals(cp.Cartcount().getText(), "0");	
	}
}
