package co.uk.Magento2.Test_web;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.AbstractPage;
import pages.HomePage;
import pages.MyAccount;
import pages.MyDashboard;

public class MagentoTestRunner {
	
	private WebDriver driver;
	private AbstractPage abstractPage;
	private HomePage homePage;
	private MyAccount myAccount;
	private MyDashboard MyDashboard;
	
	
	@Before
	public void setup (){
	System.setProperty("webdriver.gecko.driver", "C:\\Automation\\projects\\"
			+ "github_opensource_repos\\"
			+ "basic_selenium_java_codes_repo\\Magento_Maven_Project2"
			+ "\\Test_web\\drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	abstractPage = new AbstractPage(driver);
	homePage = new HomePage(driver);
	myAccount = new MyAccount(driver);
	MyDashboard myDashboard = new MyDashboard(driver);
	
	
	
	}
	@Test
	public void magentologinTest() {
	abstractPage.setupTest();
		
	}
	@After
	public void teardown() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
