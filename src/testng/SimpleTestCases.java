package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SimpleTestCases {
	WebDriver driver = null;

	@BeforeMethod
	public void openbrowser() {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/91814/Desktop/selenium/Offline%20Website/Offline%20Website/index.html");
	}

	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

	@Test(priority = 1)
	public void checkLogo() {
		WebElement logo = driver.findElement(By.xpath("//img"));
		boolean actLogo = logo.isDisplayed();
		System.out.println(logo.getText());
		Assert.assertEquals(actLogo, true);
	}

	@Test(priority = 2)
	public void checkLogInTitle() {
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

	@Test(priority = 3)
	public void signIn() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@Test(priority = 5)
	public void checkTextOnLogIn() {
		String act = driver.findElement(By.className("login-box-msg")).getText();
		String exp = "Sign in to start your session";
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 6)
	public void checkErroMsg() {
		// driver.findElement(By.id("email")).sendKeys("");
		// driver.findElement(By.id("password")).sendKeys("123456");
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(driver.findElements(By.id("email_error")), "Please enter email.");
		sf.assertEquals(driver.findElements(By.id("password_error")), "Please enter password.");
	}

	@Test(priority = 7)
	public void checkRegistrationLink() {
		driver.findElement(By.linkText("Register a new membership")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Registration Page");

	}

	@Test(priority = 8)
	public void checkTextOnLink1() {
		String act = driver.findElement(By.tagName("b")).getText();
		String exp = "Java By Kiran";
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 9)
	public void checkTextOnLink2() {
		String act = driver.findElement(By.tagName("h4")).getText();
		String exp = "JAVA | SELENIUM | PYTHON";
		Assert.assertEquals(act, exp);
	}

	@Test(priority = 10)
	public void RegistrationPage() {
		driver.findElement(By.linkText("Register a new membership")).click();
		driver.findElement(By.id("name")).sendKeys("Nitesh");
		driver.findElement(By.id("mobile")).sendKeys("8989898978");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		String actAlertMsg = driver.switchTo().alert().getText();
		String expAlertMsg = "User registered successfully.";
		driver.switchTo().alert().accept();
		Assert.assertEquals(actAlertMsg, expAlertMsg);
	}

}
