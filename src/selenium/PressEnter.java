package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressEnter {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://javabykiran.com/playground/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Inside")).click();
	WebElement textbox=driver.findElement(By.xpath("//p[contains(text(),'JBKTEST.COM')]"));
textbox.sendKeys(Keys.ENTER);
}
}