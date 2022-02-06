package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

		public static void main(String args[]) {
			WebDriver driver = (WebDriver) new ChromeDriver();
			driver.get("https://www.selenium.dev/");
		}
}
