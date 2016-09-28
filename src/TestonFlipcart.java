import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestonFlipcart {
WebDriver driver;
@BeforeMethod
public void setup()
{
	driver=new FirefoxDriver();
	driver.get("http://www.160by2.com/Index");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}
@Test
public void Flipcartsale()
{
	ClickonFlipcart flp=new ClickonFlipcart(driver);
	flp.Login1("7396618327", "7396618327");
	flp.SendFreesms1("7396618327", "hi");
	flp.ClickonFlipcart1("7396618327", "7396618327k");
	
}
}
