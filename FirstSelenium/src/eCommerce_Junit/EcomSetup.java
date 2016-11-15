package eCommerce_Junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class EcomSetup {
	

		public WebDriver browserSetup() {
			
		String geckoPath = "C:\\Automation\\projects\\github_opensource_repos\\basic_selenium_java_codes_repo\\FirstSelenium\\drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckoPath);
		WebDriver driver = new FirefoxDriver();
			return driver;	
		}
	
	
	
	

}
