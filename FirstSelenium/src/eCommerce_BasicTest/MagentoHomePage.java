package eCommerce_BasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MagentoHomePage {

	public static void main(String[] args) {
		
		WebDriver driver;
		
String geckoPath = System.getProperty("user.dir") + "\\drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe";
System.setProperty("webdriver.gecko.driver", geckoPath);


//String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver_win32\\chromedriver.exe";
//System.setProperty("webdriver.chrome.driver", chromePath);

//String geckoPath = "D:\\Automation\\work_repo\\basic_selenium_java_codes_repo\\FirstSelenium\\drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe";
//System.setProperty("webdriver.gecko.driver", geckoPath);

            
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://live.guru99.com");
		
		driver.findElement(By.xpath("//*[@id='header']/div/div[2]/div/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='header-account']/div/ul/li[6]/a")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.id("email")).sendKeys("test@kkb.com");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.id("pass")).sendKeys("123456");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.id("send2")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Validate
		
		boolean answer = driver.getPageSource().equalsIgnoreCase("John testing!");
		if(answer == true) {
		System.out.println("The test passed");
		}else {
		System.out.println("The test failed");
		}
			
		
		
		// Logout 
		driver.findElement(By.xpath("//*[@id='header']/div/div[2]/div/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='header-account']/div/ul/li[5]/a")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		driver.quit();
	
	}

}
