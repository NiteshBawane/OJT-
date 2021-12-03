package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RedBus {
	WebDriver driver;

	@Test
	public void frameHandle() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.com/");
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		Thread.sleep(5000);
		String mainWin = driver.getWindowHandle();
		driver.findElement(By.id("newFbId")).click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle); // switch focus of WebDriver to
													// the next found window
													// handle
		}
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		(driver.findElement(By.id("offline_access"))).click();

	}
}
