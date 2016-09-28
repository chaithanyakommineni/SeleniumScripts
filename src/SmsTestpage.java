import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmsTestpage {
WebDriver driver;
@BeforeMethod
public void Setup() 
{
	System.setProperty("webDriver.chrome.driver", "D:\\");
	driver=new ChromeDriver();
	
	driver.get("http://www.160by2.com/Index");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	ClickonFlipcart login=new ClickonFlipcart(driver);
	login.Login1("7396618327", "7396618327");
	

}
@Test
public void Smspage() throws IOException 
{
	SmsCollectionPage collection=new SmsCollectionPage(driver);
	collection.Clickonsms("sri", "9492055182");
}
@AfterTest
public void Teardown()
{
	driver.quit();
}
}
