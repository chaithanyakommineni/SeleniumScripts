import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
	WebDriver driver;
	public ContactPage(WebDriver driver)  {
		this.driver=driver;
		
	}
	public void AddContact(String addname,String addmobilenumber)
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//*[@id='aContacts']")).click();
	driver.switchTo().frame("by2Frame");
		//driver.findElement(By.id("addname")).sendKeys(addname);
		//driver.findElement(By.id("addmob")).sendKeys(addmobilenumber);
		
		driver.findElement(By.cssSelector("input[maxlength='15']")).sendKeys(addname);
		driver.findElement(By.cssSelector("input[id='addmob']")).sendKeys(addmobilenumber);
		WebElement element=driver.findElement(By.cssSelector("input[value='M']"));
		element.isSelected();
		element.click();
		driver.findElement(By.id("adddcon")).click();
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
	}
public void Logout()
{
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("html/body/div[2]/div/div[2]/button[4]")).click();
}
}
