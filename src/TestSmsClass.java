import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSmsClass {
	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.160by2.com/Index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void LoginTo160by2()
	{
		Sendsms sms=new Sendsms(driver);
		sms.Login("7396618327", "7396618327");
		sms.SendFreesms("8885855519", "good mrng");
	
	}

}
