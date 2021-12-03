package selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicOfSelenium {
static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
   driver=new ChromeDriver();
  driver.get("file:///C:/Users/91814/Desktop/selenium/Offline%20Website/Offline%20Website/index.html");
  driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
  driver.findElement(By.id("password")).sendKeys("123456");
  driver.findElement(By.xpath("//button")).click();
 String course=driver.findElement(By.tagName("h3")).getText();
System.out.println(course);
//driver.findElement(By.className("small-box-footer")).click();
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
Alert alert=driver.switchTo().alert();
String alertMsg=alert.getText();
System.out.println(alertMsg);
alert.accept();
  /*String act=driver.findElement(By.tagName("b")).getText();
  System.out.println(act);
  String exp=driver.findElement(By.tagName("h4")).getText();
  System.out.println(exp);

  String lt=driver.findElement(By.linkText("Register a new membership")).getText();
 System.out.println(lt);
// driver.findElement(By.linkText("Register a new membership")).click();;
String cn=driver.findElement(By.className("login-box-msg")).getText();
System.out.println(cn);
String name=driver.findElement(By.tagName("a")).getText();
System.out.println(name);
  String gt=driver.getTitle();
  System.out.println(gt);
 String gwh=driver.getWindowHandle();
 System.out.println(gwh);
String gc=driver.getCurrentUrl();
System.out.println(gc);
String gp=driver.getPageSource();
//System.out.println(gp);
//WebElement logo=driver.findElement(By.xpath("/html/body/div/center/img"));
//String logotext=logo.getText();
//System.out.println(logotext);
*/
}

}
