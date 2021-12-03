package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoIT {
	

	WebDriver driver;
	@Test
	public void testUpload() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://javabykiran.com/playground");
		System.out.println(1);
		driver.findElement(By.linkText("File Upload")).click();
		System.out.println(2);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='file']")).click();
		System.out.println(3);
		Thread.sleep(5000);

		StringSelection ss = new StringSelection("C:\\Users\\91814\\Documents\\AutoIT.exe");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot=new Robot();
		robot.delay(250); 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();

		System.out.println("file is uploaded..");

	}}