package eCommerce_Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;



public class EcomRunPage {
	
	
	 @BeforeClass
	   public static void connectToDd(){
		   System.out.println("Connection Establish");
		   
	   }
	 
	 
	 @AfterClass
	   public static void quitDd() {
		   System.out.println("Connection closed");   
	   }
	

	private static WebDriver driver;
	private EcomLoginPage ecomloginpage;
	private EcomValidate ecomvalidate;
	
		@Before 
		public void setUpTest(){
			EcomSetup ecomsetup = new EcomSetup();	
			WebDriver driver = ecomsetup.browserSetup();
			ecomloginpage = new EcomLoginPage(driver);
			ecomloginpage.loadingBrowser();
			ecomvalidate = new EcomValidate(driver);
			
		}
		
		@After
		public void endUpTest(){
			ecomloginpage.tearDown();
           }
		
		
		@Test 
        public void logTestLogin() {
        	ecomloginpage.enterUrl("http://live.guru99.com");
        	ecomloginpage.loginIn("test2@kkb.com", "123456");
        	ecomvalidate.validatetest("John testing2!");
        	
         	}
	

        @Test @Ignore
        public void testLogOut() {
        	ecomloginpage.enterUrl("http://live.guru99.com");
        	ecomloginpage.loginIn("test@kkb.com", "123456");
        	ecomvalidate.validatetest("John testing!");
        	ecomloginpage.logOut();
        	
        	
         	}
        
        @Test 
        public void logTestUser2() {
        	ecomloginpage.enterUrl("http://live.guru99.com");
        	ecomloginpage.loginIn("test@kkb.com", "123456");
        	
         	}
       
    
        @Test 
        public void testInvalidLog() {
        ecomloginpage.enterUrl("http://live.guru99.com");
        ecomloginpage.invalidPasswordLogin("test2@kkb.com", "232234");
        ecomvalidate.validatetest("Invalid login or password");
        	
        }
 
}

