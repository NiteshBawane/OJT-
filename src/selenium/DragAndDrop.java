package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://javabykiran.com/playground/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Drag and Drop")).click();
		WebElement fromWebElement = driver.findElement(By.xpath("//div[contains(text(),'Home')]"));
		WebElement toWebElement = driver.findElement(By.xpath("//div[contains(text(),'Contact Us')]"));

		Actions action = new Actions(driver);
		Thread.sleep(2000);
		Action dragAndDrop = action.clickAndHold(fromWebElement).moveToElement(toWebElement).release(toWebElement)
				.build();
		dragAndDrop.perform();

		WebElement fromWebElement1 = driver.findElement(By.xpath("//div[contains(text(),'Home')]"));
		WebElement toWebElement1 = driver.findElement(By.xpath("//div[contains(text(),'About Us')]"));
		Actions builder = new Actions(driver);
		Thread.sleep(2000);
		Action dragdrop = builder.clickAndHold(fromWebElement1).moveToElement(toWebElement1).release(toWebElement1)
				.build();
		dragdrop.perform();

		Thread.sleep(2000);
		Action dragdrop1 = builder.dragAndDrop(fromWebElement, toWebElement).build();
		dragdrop1.perform();
		
	}
}
