package thirdAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NicksonSite {
	
	static WebDriver driver;
	static Nickson1 nickson1;
	

	public static void main(String[] args) {
		
		String geckoPath = "C:\\Automation\\projects\\Java_projects\\FirstSelenium\\drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe";	
		System.setProperty("webdriver.gecko.driver", geckoPath);
		
		driver = new FirefoxDriver();
		
		nickson1 = new Nickson1(driver);
		nickson1.openWindow();
		
		try {
			nickson1.delay();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		nickson1.enterUrl();
	

	}

}
