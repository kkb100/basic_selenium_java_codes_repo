package Module11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {
	
	String Browser = "Chrome";
	
	@Test
	public void launchTest() throws InterruptedException {
		
	//String FFPath = "C:\\Automation\\projects\\github_opensource_repos\\basic_selenium_java_codes_repo\\FirstSelenium\\drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe";
	//System.setProperty("webdriver.gecko.driver", FFPath);
		
	String ans = System.getProperty("user.dir");
	
	System.out.println(ans);
	
	
	String ChromPath = System.getProperty("user.dir") + "\\drivers\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", ChromPath);
	
	WebDriver driver = null;
	
	if (Browser==("Firefox")) {
		driver = new FirefoxDriver();
	}else if (Browser==("Chrome")) {
		driver = new ChromeDriver();
	}
	
	driver.get("https://www.google.co.uk/");
	WebElement search_feild = driver.findElement(By.id("lst-ib"));
	search_feild.sendKeys("Boy games");
	Thread.sleep(3000);
	
	WebElement result_list = driver.findElement(By.xpath("//*[@id='sbse1']/div[2]/b"));
	result_list.click();
	
	driver.quit();
	}
	
	
	

}
