package faceBook;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FaceBookLogin {
	
	
	private HomePage homePage;
	private Validation  validation;
	private String username = "david.green90@outlook.com";
	private String password = "Davidg90";
	
	@BeforeClass
	public static void globalSetUp(){
		System.out.println("Running once before all the test...");
	}
	
	
	@AfterClass
	public static void globalCleanUp(){
		System.out.println("Run once again after all the test...");
	}
	
	
	@Before
	public void setUpTest(){
		ApplicationBase applicationbase = new ApplicationBase();	
		WebDriver driver = applicationbase.SetupBrowser();
		homePage = new HomePage(driver);
		//validation = new Validation(driver);
		homePage.openWindow();
		homePage.enterUrl();
	}
	
	
	@After
	public void CleanUpTest(){
		homePage.closeWindows();
	}
	
	
	
    
	@Test
	public void testFacebookLogin(){
		homePage.loginWith(username, password);
		//validation.validatefacebookLogin();
	}
	
	
	@Test
	public void testFacebookLogout(){			
		homePage.loginWith(username, password);
		//validation.validatefacebookLogin();
	}
	
	@Test
	public void testFacebookLo(){			
		homePage.loginWith(username, password);
		//validation.validatefacebookLogin();
	}
	
	
	
	
}


