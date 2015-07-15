import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SearchTest {


	protected  WebDriver driver;
	
	@Test
	public void searchForItemTest() {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		driver.get("http://www.google.com");
		System.out.println("the test is ok");
		driver.quit();
		
	}


}
