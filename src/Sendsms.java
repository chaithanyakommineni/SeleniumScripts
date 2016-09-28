import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Sendsms {
	WebDriver driver;
	public Sendsms(WebDriver driver)
	{
		this.driver=driver;
	}
public void Login(String username,String password)
{
driver.findElement(By.id("username")).sendKeys(username);	
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.xpath(".//*[@id='loginform']/div/section/div/div[1]/div[3]/div[3]/button")).click();
}
public void SendFreesms(String number,String text)
{
	driver.switchTo().frame("by2Frame");
	//driver.findElement(By.xpath("da-sms-btn")).click();
	driver.findElement(By.xpath(".//*[@id='frmDashboard']/div[1]/div[2]/div[1]/button")).click();
	driver.findElement(By.xpath(".//*[@class='ui-autocomplete-input']]]")).sendKeys(number);
	driver.findElement(By.xpath(".//*[@id='sendSMSMsg']]")).sendKeys(text);
	driver.findElement(By.id("btnsendsms")).click();
	List<WebElement> link=driver.findElements(By.tagName("a"));
	System.out.println(link.size());
	//driver.findElement(By.xpath(".//*[@id='99895934670']/td[2]")).click();
	//driver.findElement(By.xpath(".//*[@id='ulMsgs']/li[1]/a")).click();
	//driver.findElement(By.xpath(".//*[@id='btnsendsms']")).click();
}

}