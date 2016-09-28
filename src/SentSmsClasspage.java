import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SentSmsClasspage {
WebDriver driver;
public SentSmsClasspage(WebDriver driver)
{
	this.driver=driver;
}
public void ClickonSentsms()
{

	driver.switchTo().defaultContent();
	driver.findElement(By.id("aSentBox")).click();
	driver.switchTo().frame("by2Frame");
	driver.findElement(By.id("selectDate")).click();
	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
	driver.findElement(By.linkText("31")).click();
	driver.findElement(By.xpath(".//*[@id='frmSentBox']/div/section/div[1]/input[2]")).click();
	driver.findElement(By.linkText("View Full Report")).click();
	WebElement element=driver.findElement(By.xpath(".//*[@value='3777434']"));
	element.isSelected();
	element.click();
	driver.findElement(By.cssSelector("input[value='Delete']")).click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
}
