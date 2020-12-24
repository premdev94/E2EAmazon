package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))).build().perform();
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		
		driver.findElementById("ap_email").sendKeys("8124089046");
		driver.findElementById("continue").click();
		driver.findElementById("ap_password").sendKeys("Rithu@123");
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println(driver.findElementById("nav-cart-count").getText());
		Assert.assertEquals(driver.findElementById("nav-cart-count").getText(), "0");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("MI Tv");
		search.sendKeys(Keys.ENTER);
		//Thread.sleep(5000);
		driver.findElementByXPath("//*[text()='MI']").click();
		
		driver.findElementByXPath("//*[text()='Mi Soundbar with 8 Speaker Drivers (White)']").click();
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String Parentid=it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		System.out.println(driver.findElementById("productTitle").getText());
		//driver.findElementById("productTitle").sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Assert.assertEquals(driver.findElementById("productTitle").getText(), "Mi Soundbar with 8 Speaker Drivers (White)");
		
		Select Quantity=new Select(driver.findElementByName("quantity"));
		Quantity.selectByVisibleText("2");
		driver.findElementById("add-to-cart-button").click();
		driver.findElementById("nav-cart").click();
		System.out.println(driver.findElementById("nav-cart-count").getText());
		Assert.assertEquals(driver.findElementById("nav-cart-count").getText(), "2");
		Thread.sleep(5000);
		driver.findElementByXPath("//input[@value='Delete']").click();
		driver.close();
		driver.switchTo().window(Parentid);
		driver.findElementById("nav-cart").click();
		System.out.println(driver.findElementById("nav-cart-count").getText());
		Assert.assertEquals(driver.findElementById("nav-cart-count").getText(), "0");
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Prem']"))).build().perform();
		driver.findElementByLinkText("Sign Out").click();
		driver.quit();
		
		
	}

	

}
