package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("alert")).click();
		Thread.sleep(3000);
		String actualText = driver.switchTo().alert().getText();
		String expectedText = "Please share this website with your friends and in your organization only.";
		if (actualText.equals(expectedText)) {
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test Case Failed");
		}
		driver.switchTo().alert().accept();
		driver.quit();
	}
}
