import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnContactPage {
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
	public void AddcontactValid()
	{
		ContactPage C= new ContactPage(driver);
		C.AddContact("chaithanya", "7396618327");
		C.Logout();
	}

}
