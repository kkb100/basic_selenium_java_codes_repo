package pages;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;

	public AbstractPage (WebDriver driver) {
	this.driver = driver;
	}
	
	
	public void setupTest() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://live.guru99.com");	
	}
	
	
	
	public void cleanupTest() {
	    driver.quit();
	}
	
	
	
	

	
	
}
