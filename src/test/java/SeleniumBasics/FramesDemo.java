package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");
		List<WebElement> frames =  driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		//driver.switchTo().frame(0);
		WebElement frame=  driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Ajay");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.quit();
	}
}
