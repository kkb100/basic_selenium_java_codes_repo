package Module11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desirecapability {

	public static void main(String[] args) {
		
		WebDriver driver;
	 
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("Firefox");
		cap.setJavascriptEnabled(true);
		
		
		String ans = System.getProperty("user.dir");
		
		System.out.println(ans);
		
		String FFPath = "C:\\Automation\\projects\\github_opensource_repos\\basic_selenium_java_codes_repo\\FirstSelenium\\drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FFPath);
		
		driver = new FirefoxDriver(cap);
		driver.quit();
		
		

	}

}
