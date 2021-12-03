package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class CheckColour {
	static WebDriver driver=null;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.linkedin.com/");
   String buttonColor = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).getCssValue("background-color");
    String buttonTextColor = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).getCssValue("color");
   System.out.println("Button color: " + buttonColor);
   System.out.println("Text color " + buttonTextColor);
   String hex=Color.fromString(buttonTextColor).asHex();
   System.out.println(hex);
   String hex1=Color.fromString(buttonColor).asHex();
   System.out.println(hex1);

}
}