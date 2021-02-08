package baseTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected static WebDriver driver;
	
	@Before
	public void beforeTest() {
		System.setProperty ("webdriver.chrome.driver", "c:/eclipse/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
    public void afterTest() {
		driver.quit();
	}
	
//  public void cleanUp(){
//  driver.manage().deleteAllCookies();
//}
	
}
