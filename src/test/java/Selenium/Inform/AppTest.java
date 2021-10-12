package Selenium.Inform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest {
	private static WebDriver driver = null;

	public static void main(String[] args) {

		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "/lib/chromedriver/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://localhost:8085/java-tomcat-maven-example/");

		String bodyText = driver.findElement(By.tagName("h2")).getText();
		System.out.println(bodyText);

		if (bodyText.contains("Hello World!")) {

			System.out.println("TEST PASSED!");

		} else {

			System.out.println("TEST FAILED");
		}

		driver.close();

	}
}
