package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	/*
	 * TestNG: Test Next Generation it is a unit testing framework inspired from
	 * JUnit and NUnit Its open source and free Prior to this we had JUnit
	 * 
	 * Features: 1. Various Annotations 2. HTML Report 3. Priority/Sequencing - Done
	 * 4. Dependency 5. Grouping of TC 6. Data Provider 7. Assertion 8. testng.xml
	 * file
	 * 
	 * Step1: get the eclipse url
	 * 
	 * step2: Eclipse >> Help >> Install New software restart once done
	 * 
	 * Next:
	 * Grouping of cases
	 * Data Provider
	 * 
	 */
	WebDriver driver;

	@BeforeTest
	public void DoingConfiguration() {
		System.out.println("Configurations");
	}
	
	@BeforeMethod
	public void setUp() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	public void validateUserName() {
		// boolean userName = driver.findElement(By.id("txtUsername123")).isDisplayed();
		// Assert.assertTrue(userName);
	}

	@Test(priority = 2)
	public void validateHomePage() {
		System.out.println("Validating Home Page");
	}

	@Test(priority = 1, groups = "smoke")
	public void validateLogin() {
		System.out.println("Validating Login");
		Assert.assertTrue(false);
	}

	@Test(priority = 3)
	public void resetPassword() {
		System.out.println("Reset Password Testing");
	}
	
	@Test(priority = 4, enabled = false)
	public void skippingTC() {
		System.out.println("Skipping TC");
	}
	
	@Test(groups = "smoke")
	public void SmokeTC1() {
		System.out.println("Smoke TC 1");
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}

	/*
	 * 1. Validate the title of the page is OrangeHRM 2. Validate username field is
	 * displayed 3. Validate Login Panel Text is displayed 4. In Users tab >> Search
	 * for ajay >> No record found should be displayed 5. In Users tab >> Search for
	 * aravind >> Atleast one record should be displayed
	 */

}
