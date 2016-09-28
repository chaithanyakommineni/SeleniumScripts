import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ClickonFlipcart {
	WebDriver driver;

public ClickonFlipcart (WebDriver driver) 
{
this.driver=driver;	
}
public void Login1(String username,String password)
{
driver.findElement(By.id("username")).sendKeys(username);	
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.xpath(".//*[@id='loginform']/div/section/div/div[1]/div[3]/div[3]/button")).click();
driver.findElement(By.xpath("html/body/div[1]/section/div[1]/div[1]/div[4]/button[1]")).click();
List<WebElement> link = driver.findElements(By.tagName("a")); 
System.out.println(link.size()); 


driver.switchTo().frame("by2Frame");

driver.findElement(By.xpath(".//*[@id='frmDashboard']/div[1]/div[2]/div[1]/button")).click();

}
public void SendFreesms1(String number,String text)
{
	driver.switchTo().defaultContent();
	driver.switchTo().frame("by2Frame");
	driver.findElement(By.cssSelector("input[placeholder*='Enter Mobile Number']")).sendKeys(number);
	driver.findElement(By.cssSelector("textarea[placeholder*='Enter your ']")).sendKeys(text);
	driver.findElement(By.id("btnsendsms")).click();
	 
	driver.findElement(By.xpath(".//*[@id='88853555191']/td[2]")).click();
	
	driver.findElement(By.xpath(".//*[@id='ulMsgs']/li[1]/a")).click();
	driver.findElement(By.xpath(".//*[@id='btnsendsms']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("by2Frame");
}
public void ClickonFlipcart1(String number,String password)
{

	String parentwindowid=driver.getWindowHandle();
	  System.out.println("parentwindowid:"+parentwindowid);
	  driver.switchTo().defaultContent();
	  WebElement element =
			  driver.findElement(By.xpath(".//*[@id='aFindYogi']"));
	

	 element.click();
	  System.out.println("Current window id: "+driver.getWindowHandle());
	  Set<String> setwindowids = driver.getWindowHandles();
	 for(String window: setwindowids){
	   if(window.equals(parentwindowid))
	    continue;
	   else
	    driver.switchTo().window(window);

	  }
	  System.out.println("Current window title: " +driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Freedom Sale 1 Online at Best Price | Flipkart.com");
	  driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(number);
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span")).click();
		driver.close();
			  driver.switchTo().window(parentwindowid);
			  System.out.println("Current window:"+ driver.getTitle());
			 // List<WebElement> link = driver.findElements(By.tagName("a")); 
			  List<WebElement> link = driver.findElements(By.tagName("a")); 
				 System.out.println(link.size()); 

		}

}

