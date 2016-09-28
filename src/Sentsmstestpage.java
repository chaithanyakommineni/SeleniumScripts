import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sentsmstestpage {
	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.160by2.com/Index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ClickonFlipcart login=new ClickonFlipcart(driver);
		login.Login1("7396618327", "7396618327");
		
	}
@Test
public void Sentsms()
{
	SentSmsClasspage page=new SentSmsClasspage(driver);
	page.ClickonSentsms();
}
@AfterTest
public void close()
{
	driver.quit();
}
}
