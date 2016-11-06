package faceBook;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validation {
	
	private WebDriver driver;


	public Validation (WebDriver driver){
		this.driver = driver;
	}
	
	public void validatefacebookLogin() {
		
		
	
		boolean result = driver.getPageSource().toLowerCase().contains("david");	
		
		Assert.assertTrue(result);
//		Assert.assertFalse(result);
	}

}
