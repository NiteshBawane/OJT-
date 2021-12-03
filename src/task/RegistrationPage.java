package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPage {
	@Test
	public void test03() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91814/Desktop/selenium/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.linkText("Register a new membership")).click();
		driver.findElement(By.id("name")).sendKeys("Nitesh");
		driver.findElement(By.id("mobile")).sendKeys("8989898978");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
	String actAlertMsg=driver.switchTo().alert().getText();
	String expAlertMsg="User registered successfully.";
		driver.switchTo().alert().accept();
		Assert.assertEquals(actAlertMsg, expAlertMsg);
	}
@Test
public void checkLogo() {
	System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/91814/Desktop/selenium/Offline%20Website/Offline%20Website/index.html");
	WebElement logo=driver.findElement(By.xpath("/html/body/div/center/img"));
   boolean actLogo=logo.isDisplayed();
   System.out.println(logo.getText());
   Assert.assertEquals(actLogo, true);
}}
