package first.maven_project;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


class firstTest {

	@Test
	public void firstTestCase() throws Exception {
	WebDriverManager.chromedriver().arch32().driverVersion("72").setup();
		System.out.println("chrome driver");
		WebDriver driver = new ChromeDriver();
		System.out.println("After chrome driver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		driver.get("https://www.bestbuy.com/"); 
		driver.manage().window().maximize(); 
		WebElement ele = driver.findElement(By.xpath("//img[@alt='United States']"));
		ele.click();
		WebElement email = driver.findElement(By.xpath("//input[@class='email-txt-box']"));
		email.sendKeys("khan231@gmail.com");
		email.submit();
		
		//driver.get("https://www.woolworths.com.au/shop/securelogin");
		//System.out.println("Executed before finding element");
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc45@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password\n");
		//Thread.sleep(3000);
		//Actions builder = new Actions(driver);
		//WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		//builder.moveToElement(ele).click(ele);
		//builder.perform();
		
	}
	
}
