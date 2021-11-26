package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) {
		System.out.println(1);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement fruitsDropDwon = driver.findElement(By.id("fruits"));
		Select select = new Select(fruitsDropDwon);
		List<WebElement> options = select.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		//selecting by index
		//select.selectByIndex(1);
		
		//select.selectByValue("orange");
		select.selectByVisibleText("Grape");
		
		
		//driver.quit();
	}
}
