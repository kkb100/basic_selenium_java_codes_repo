package Module11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {


	public static void main(String[] args) {
	
	String Broswer = "Chrome";
	
	String chromepath = System.getProperty("user.dir") + "\\drivers\\chromedriver_win32\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromepath);
    
    WebDriver driver = null;
    
    if(Broswer==("Chrome")) {
    driver = new ChromeDriver();
    }
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("http://gmail.com");
    String text= driver.findElement(By.id("next")).getAttribute("value");
    
   String text1 = driver.findElement(By.xpath("html/body/div/div[2]/div[1]/h1")).getText();
   
   System.out.println(text);
   System.out.println(text1);
   
   driver.close();
		

	}

}
