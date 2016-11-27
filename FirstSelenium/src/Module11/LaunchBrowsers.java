package Module11;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {
	
	String Browser = "Chrome";
	
	@Test
	public void launchTest() {
		
	//String FFPath = "C:\\Automation\\projects\\github_opensource_repos\\basic_selenium_java_codes_repo\\FirstSelenium\\drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe";
	//System.setProperty("webdriver.gecko.driver", FFPath);
	
	String ChromPath = "C:\\Automation\\projects\\github_opensource_repos\\basic_selenium_java_codes_repo\\FirstSelenium\\drivers\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", ChromPath);
	
	WebDriver driver = null;
	
	if (Browser.equals("Firefox")) {
		driver = new FirefoxDriver();
	}else if (Browser.equals("Chrome")) {
		driver = new ChromeDriver();
	}
	
	driver.get("http://facebook.com");
	driver.quit();
	}

}
