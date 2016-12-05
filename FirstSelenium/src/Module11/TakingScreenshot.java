package Module11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class TakingScreenshot {

	public static void main(String[] args) throws IOException {
		

		String Broswer = "Chrome";
		
		String chromepath = System.getProperty("user.dir") + "\\drivers\\chromedriver_win32\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", chromepath);
	    
	    WebDriver driver = null;
	    
	    if(Broswer==("Chrome")) {
	    driver = new ChromeDriver();
	    }
	    
	    driver.manage().window().maximize();
	    driver.get("http://gmail.com");
		
		File srcFile= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Screen.png"));

	}

}
