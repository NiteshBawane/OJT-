package selenium;

import java.awt.event.KeyEvent;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RobotClass {

	WebDriver driver;

	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/91814/Desktop/selenium/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
		Actions logo = new Actions(driver);
		logo.contextClick(driver.findElement(By.tagName("img"))).perform();

		Robot r = new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.delay(5000);
		}

		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.delay(5000);
		}

	}

}
