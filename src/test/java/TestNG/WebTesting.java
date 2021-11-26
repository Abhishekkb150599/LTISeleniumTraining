package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class WebTesting {

	@BeforeTest
	public void moreConfig() {
		System.out.println("More Configs");
	}
	
	@Test(groups = "smoke")
	public void webLogin() {
		System.out.println("Web Login");
	}
	
	@Test
	public void SendRequest() {
		System.out.println("Sending Request");
	}
	
}
