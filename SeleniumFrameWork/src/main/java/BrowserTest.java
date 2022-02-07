import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/girishpattewar/eclipse-workspace/Selenium/testrepository/SeleniumFrameWork/driver/geckodriver/geckodriver");
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
	}

}
