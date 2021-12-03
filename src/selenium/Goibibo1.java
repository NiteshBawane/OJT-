package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Goibibo1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("PNQ");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
       driver.findElement(By.id("gosuggest_inputDest")).sendKeys("NAG");
		Robot r1=new Robot();
        r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
//		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Chennai");
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("react-autosuggest- 1")));
//		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.DOWN);
	}

}
