package eCommerce_Level1;

import org.openqa.selenium.WebDriver;

public class EcomValidate {
	
	
	private WebDriver driver;
	
	public EcomValidate (WebDriver driver){
		  this.driver = driver;
		  
	}
	
	public void validatetest () {
		
		boolean answer = driver.getPageSource().toLowerCase().contains("John testing!".toLowerCase());
		if(answer == true) {
		System.out.println("The test passed");
		}else {
		System.out.println("The test failed");
		}
		
	}
	
	
	

}
