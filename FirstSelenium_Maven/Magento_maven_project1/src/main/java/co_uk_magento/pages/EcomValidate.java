package co_uk_magento.pages;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EcomValidate {
	
	
	private WebDriver driver;
	public EcomValidate (WebDriver driver){
		  this.driver = driver;
		  
	}
	
	public void validatetest (String user) {
		
		boolean answer = driver.getPageSource().toLowerCase().contains(user.toLowerCase());
		Assert.assertTrue("Does not contain", answer);
		
		boolean ans = driver.getPageSource().contains(user);
		
	
		
	}
	
	
	

}
