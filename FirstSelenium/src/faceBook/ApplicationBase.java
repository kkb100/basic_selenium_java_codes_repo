package faceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationBase {
	
public WebDriver SetupBrowser (){

String geckoPath = "C:\\Automation\\projects\\github_opensource_repos\\basic_selenium_java_codes_repo\\FirstSelenium\\drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", geckoPath);
		return new FirefoxDriver();
		
		//return driver;
	}
	

}

