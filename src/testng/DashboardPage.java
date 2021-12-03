package testng;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardPage {
	static WebDriver driver = null;
	static List<WebElement> courses;

	@BeforeMethod
	public void openDashboardPage() {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/91814/Desktop/selenium/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
	}

	// @AfterMethod
	// public void closebrowser() {
	// driver.quit();
	// }

	@Test(priority = 1)
	public void verifyCourses() {
		List<WebElement> courses = driver.findElements(By.tagName("h3"));
		ArrayList<String> actCourseName = new ArrayList<String>();
		for (WebElement course : courses) {
			String text = course.getText();
			actCourseName.add(text);
		}
		ArrayList<String> expCourseName = new ArrayList<String>();
		expCourseName.add("Selenium");
		expCourseName.add("Java / J2EE");
		expCourseName.add("Python");
		expCourseName.add("Php");
		Assert.assertEquals(actCourseName, expCourseName);

	}
	@Test
	public void verifyCourseType(){
	List<WebElement> type= driver.findElements(By.xpath("//p"));
	ArrayList<String> actCourseType=new ArrayList<>();
	for (WebElement webElement : type) {
	   String text=webElement.getText();
	   actCourseType.add(text);
	}
	ArrayList<String> expCourseType=new ArrayList<>();
	expCourseType.add("Kiran");
	expCourseType.add("Automation Testing");
	expCourseType.add("Software Development");
	expCourseType.add("Data Science");
	expCourseType.add("Web Development");
	Assert.assertEquals(actCourseType,expCourseType);
	System.out.println(actCourseType);
	}

	@Test(priority = 2)
	public void userForm() throws Exception {
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.id("username")).sendKeys("Nitesh");
		driver.findElement(By.id("mobile")).sendKeys("88888888888");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("course")).sendKeys("Selenium");
		driver.findElement(By.id("Male")).click();
		driver.findElement(By.xpath("//option[2]")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		Alert alert = driver.switchTo().alert();
		String actalertMsg = alert.getText();
		String expalertMag = "User Added Successfully. You can not see added user.";
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(actalertMsg, expalertMag);

	}

	@Test(priority = 3)
	public void deletUser() throws Exception {
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.linkText("Delete")).click();
		Alert alert = driver.switchTo().alert();
		String actalertMsg = alert.getText();
		String expalertMag = "You can not delete Default User";
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(actalertMsg, expalertMag);

	}
	
	@Test(priority = 4)
	public void openJBKSite() {
		driver.navigate();
		driver.findElement(By.linkText("JavaByKiran")).click();
		String act = driver.getTitle();
		System.out.println(act);
	}

	@Test
	public void checkdeletUser2() throws Exception {
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("//*[@id=\"tr_2\"]/td[8]/a/span")).click();
		Alert alert = driver.switchTo().alert();
		String actalertMsg = alert.getText();
		String expalertMag = "Are you sure you want to delete this user";
		Thread.sleep(2000);
		Assert.assertEquals(actalertMsg, expalertMag);
	}

	@Test
	public void deletUser2() throws Exception {
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("//*[@id=\"tr_2\"]/td[8]/a/span")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String actalertMsg = alert.getText();
		String expalertMag = "User deleted successfully.";
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(actalertMsg, expalertMag);

	}
	@Test
	public void checkFooterText(){
		driver.findElement(By.linkText("Users")).click();
		String actfooter= driver.findElement(By.xpath("//footer")).getText();
		System.out.println(actfooter);
		String expfooter="Design for Selenium Automation Test V 2.3.0\nCopyright © 2005-2019 JavaByKiran. All rights reserved.";
		Assert.assertEquals(actfooter, expfooter);
	}
	@Test
	public void checkRadioBtn_DrowpDown(){
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("//button")).click();
		Select select=new Select(driver.findElement(By.xpath("//select")));
		select.selectByVisibleText("Maharashtra");
		
		WebElement male=driver.findElement(By.id("Male"));
	System.out.println(male.isDisplayed());	
	System.out.println(male.isEnabled());
		male.click();
		System.out.println(male.isSelected());
		
	}
	
}
