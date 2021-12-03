package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DashboardPage {
	static WebDriver driver;
	static List<WebElement> courses;

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/91814/Desktop/selenium/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		List<WebElement> courses = driver.findElements(By.xpath("//h3"));
		ArrayList<String> actCourseName = new ArrayList<String>();
		for (WebElement course : courses) {
			String text = course.getText();
			actCourseName.add(text);
		}

		System.out.println(actCourseName);

		//
		// for (int i = 0; i < courses.size(); i++) {
		// String course = courses.get(i).getText();
		// System.out.println(course);
		// }

		
		List<WebElement> colour=driver.findElements(By.className("small-box bg-green"));
		ArrayList<String> co=new ArrayList<>();
		for (WebElement string : colour) {
			String actco=string.getText();
			co.add(actco);
		}
		System.out.println(co);

	}

}
