package Module11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypeOfWait {

	public static void main(String[] args) {
	
		String Broswer = "Chrome";
		
		String chromepath = System.getProperty("user.dir") + "\\drivers\\chromedriver_win32\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", chromepath);
	    
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.tesco.com/");
	  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    WebDriverWait wait = new  WebDriverWait(driver, 40);
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[5]/div[1]/div/div/div[1]/a/span")));
	    
	    
	   
	    driver.close();

	}

}
