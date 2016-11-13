package eCommerce_Level1;

import org.openqa.selenium.WebDriver;

public class EcomRunPage {

	private static WebDriver driver;

	public static void main(String[] args) {
		

		EcomSetup ecomsetup = new EcomSetup();
		
		WebDriver driver = ecomsetup.browserSetup();
		
	    EcomLoginPage ecomloginpage = new EcomLoginPage(driver);
	    EcomValidate ecomvalidate = new EcomValidate(driver);
		
	    ecomloginpage.loadingBrowser();
	    ecomloginpage.enterUrl();
	    ecomloginpage.loginIn();
	    ecomvalidate.validatetest();
	    ecomloginpage.closeTest();
	    
	}

}
