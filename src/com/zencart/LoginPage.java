package com.zencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91814\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://ingecnotechnologies.com/other/zenith//");
	System.out.println(driver.getTitle());
	driver.findElement(By.partialLinkText("log")).click();
	driver.findElement(By.id("login-email-address")).sendKeys("nitesh@gmail.com");
	driver.findElement(By.id("login-password")).sendKeys("1234567");
	driver.findElement(By.xpath("//input[@value='Sign In']")).click();
	System.out.println(driver.getTitle());

	/*driver.get("http://ingecnotechnologies.com/other/zenith//");
	driver.manage().window().maximize();
	driver.findElement(By.id("email-address")).sendKeys("nitesh@gmail.com");
	driver.findElement(By.id("password-new")).sendKeys("1234567");
	driver.findElement(By.id("password-confirm")).sendKeys("1234567");
//	driver.findElement(By.xpath("//input[@value='Submit the Information']")).click();
	WebElement country=driver.findElement(By.id("country"));
	SelectUtils.selectbyText("India", country);*/
}
}
