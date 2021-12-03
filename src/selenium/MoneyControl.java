package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyControl {
public static void main(String[] args) throws Exception {
	WebDriver driver = null;
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.moneycontrol.com/markets/indian-indices/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//div[@class='clearfix inditablecnt']"));
	Thread.sleep(5000);
	String text=driver.findElement(By.xpath("//div[text()='Name']")).getText();
	System.out.println(text);
	
}
}
