package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationDemo {

	/*
	 * Synchronization:
	 * it is the sync between selenium execution speed and the browser speed
	 * PageLoadTimeOut: time to wait for the page to load
	 * 
	 * 1. Implicit wait: defines the amount of time to wait for an element 
	 * applicable to all the elements on the page
	 * 
	 * 2. Explicit wait
	 * it is used to inform the webdriver to wait for certain conditions
	 * more intelligent kind
	 * but can be applied for specific elements
	 * 
	 * Thread.sleep
	 * button is loaded in 3 seconds
	 * thread.sleep for 10 seconds
	 * 
	 * wait
	 * button is loaded in 3 seconds
	 * it will be clicked in 3 seconds
	 * 
	 * 30 mins
	 * 35 mins
	 * 12 mins
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(1);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//driver.quit();
		
	}
}
