package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandler<WebElements> {
 WebDriver driver;
	
@Test
public void test01() throws Exception{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/91814/Desktop/selenium/Offline%20Website/Offline%20Website/index.html");
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
	String mainWin=driver.getWindowHandle();
	System.out.println("Main Window Handle id"+mainWin);
	List<WebElement> links=driver.findElements(By.partialLinkText("More info"));
	for (WebElement link : links) 
		link.click();
	//	driver.findElement(By.linkText("JavaByKiran")).click();
		Thread.sleep(5000);
		Set<String> windows=driver.getWindowHandles();
		for (String win : windows) {
			if (!win.equals(mainWin)) {
				driver.switchTo().window(win);
				Thread.sleep(5000);
				System.out.println("Child Window Handle id"+driver.getWindowHandle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
	}
	
	
}

