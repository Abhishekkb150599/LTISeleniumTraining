package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFunctions {

	public static void main(String[] args) {
		/*
		 * 1. Get Methods
		 * get():  used to launch the application
		 * getCurrentUrl(); this will give you the current URL of the application
		 * getPageSource: return the source code
		 * getTitle: return the title of the page
		 * getText: return the text of the element
		 * getAttribute: get value of any attribute
		 * getWindowHandle: return the id of the current window
		 * getWindowHandles: returns the id of all the open windows
		 * 
		 * linkText
		 * partiallinktext
		 * 
		 * findelement
		 * findelements
		 * 
		 * switch to frame
		 * paarent frame:
		 * driver.switchto.parentwindow
		 * driver.switchto.defaultcontent()
		 * 
		 * close: closes the current window pointed by driver
		 * quit: closes all the windows
		 * 
		 * pageLoadtimeout: to wait for the page to load
		 * implicitly wait: to wait for elements to load
		 * 
		 * Navigate:
		 * to
		 * back
		 * forward
		 * refresh
		 * 
		 * Actions class
		 * 
		 * Task: Print the output of these checkboxes
		 * Admin >> User Management >> Users
		 * isEnabled: I am able to select/deselect the checkbo
		 * isSelected: informs if the checkbox is selected or no
		 * isDisplayed: that the checkbox is displayed on UI
		 * 
		 */
		
		System.out.println(1);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String tagName = driver.findElement(By.id("logInPanelHeading")).getTagName();
		String text = driver.findElement(By.id("logInPanelHeading")).getText();
		System.out.println("Tag Name is "+tagName);
		System.out.println("Text is "+ text);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
