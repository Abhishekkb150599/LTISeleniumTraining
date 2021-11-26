package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//moveToElement();
		//keyBoardHandle();
		dragDrop();
		
	}
	
	public static void moveToElement() throws InterruptedException {
		System.out.println(1);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");	
		Actions actions = new Actions(driver);
		WebElement primeMenu = driver.findElement(By.xpath("//span[text()='Prime']"));
		actions.moveToElement(primeMenu).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}
	
	public static void keyBoardHandle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement userName = driver.findElement(By.id("txtUsername"));
		Actions actions = new Actions(driver);
		actions.moveToElement(userName).click()
		.keyDown(Keys.SHIFT)
		.sendKeys("a")
		.keyUp(Keys.SHIFT)
		.sendKeys("dmin")
		.build().perform();
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void dragDrop() throws InterruptedException {
		System.out.println(1);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions actions = new Actions(driver);
		//switch inside the iframe and then perform below operations
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
	/*
	 * 1. Assignment of checkbox based on name
	 * 2. Detailed note on selenium functions
	 * 3. Practise on Actions class and all selenium functions
	 * 4. Complete the Drag and Drop code
	 */
}
