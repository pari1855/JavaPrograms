package first.maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class BaseClass {
		public static WebDriver driver;
		
		@BeforeClass
		public void setupApplication() {
			Reporter.log("=======BrowserSessiontrated======");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("www.google.com");
			Reporter.log("=========Application Started=======");
			
		}
}
