package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLoginPage {

	public static void main(String[] args) {
		System.out.println(1);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("ajay.m191987@gmail.com");
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
		//driver.findElement(By.name("password")).sendKeys("password");
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		WebElement password;
		password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("Password");
	}
	
		
}
