package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91814\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Hotels']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Guests & Rooms']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(@class,'8 dxKRvV')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Children']//preceding::span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Children']//following::span[text()='+']")).click();
	}
}
