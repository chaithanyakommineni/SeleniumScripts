import java.io.File;
import java.io.IOException;

import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sun.jna.platform.FileUtils;

public class SmsCollectionPage {
	WebDriver driver;
	public SmsCollectionPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Clickonsms(String sri,String number) throws IOException 
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("SMS Collection")).click();
		driver.switchTo().frame("by2Frame");
		driver.findElement(By.id("spanCategories")).click();
		driver.findElement(By.xpath(".//*[@id='ulCategories']/li[3]")).click();
		driver.findElement(By.id("span_131")).click();
		driver.findElement(By.id("txtSearchCategory")).sendKeys(sri);
		driver.findElement(By.linkText("Sri Krishnashtami")).click();
		driver.findElement(By.xpath(".//*[@id='frmSMSCollection']/div[1]/section/div[1]/div[2]/input[2]")).click();
		WebElement element=driver.findElement(By.xpath("//div[@class='msg-box']/p[contains(text(),'For this is a special time when family And friends')]"));
		System.out.println("element: " + element.getText());
		
		
		/*Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		
		element.getTagName();
		element.getSize();
		element.getAttribute(sri);
		*/
driver.findElement(By.id("span_137")).click();

WebElement el=driver.findElement(By.xpath("//div[@class='msg-box']/p[contains(text(),'Hope Joy Abundance Delight')]"));
Actions action=new Actions(driver);
action.moveToElement(el).build().perform();
System.out.println("el: "+el.getText());
driver.findElement(By.xpath("//section[@id='sectionMsgs']/div[5]/div[1]/input[3]")).click();
driver.findElement(By.cssSelector("input[placeholder='Enter Mobile Number']")).sendKeys(number);
//driver.findElement(By.xpath("//div[@id='divSendSMS']/ul/li[3]/input")).click();
driver.findElement(By.xpath(".//*[@id='sectionMsgs']/div[15]/div/input[3]")).click();
//File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//Now you can do whatever you need to do with it, for example copy somewhere
//FileUtils.copyFile(srcFile,new File("c:\\chaitu.jpg"));
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
org.apache.commons.io.FileUtils.copyFile(scrFile,new File("C:\\Users\\chaitu\\Tracing"));



	}

}
