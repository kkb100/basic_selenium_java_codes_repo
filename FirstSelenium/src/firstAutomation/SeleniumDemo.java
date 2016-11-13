package firstAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		String geckoPath = "C:\\Automation\\projects\\Java_projects\\FirstSelenium\\drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckoPath);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://riouxsvn.com/login/");
		//driver.get("https://riouxsvn.com/login/");
		
		/* Button
		 * Radio button
		 * CheckBox
		 * Text Box/text areas
		 * Select Drop Down
		 * Text
		 */
		
		
		/*
		 * Ways of locating an element on a page
		 * By ID
		 * By Name
		 * By TagName
		 * By LinkText
		 * By PartialLinkText
		 * By ClassName
		 * By CSSSelector
		 * By XPath //Types of Xpath (Absolute Xpath/Relative Xpath/Dynamic Xpath)
		 * 
		 */
		
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	
		driver.findElement(By.id("username_login")).sendKeys("kelvin");
		driver.findElement(By.id("pwd_login")).sendKeys("passwords123");
		
		WebElement loginRauxSvn = driver.findElement(By.id("doLogin"));
		loginRauxSvn.click();
		
//		driver.findElement(By.id("doLogin")).click();
		
		
		
		//driver.findElement(By.id("ID")).sendKeys("Hello");
		//driver.findElement(By.cssSelector("CSS Selector"));
		//driver.findElement(By.name("Name")).sendKeys("John");
		//driver.findElement(
		
		
		
	//String warningMessage = "The account kelvin has been found, but the password provided is incorrect.";

		
		//if(driver.getPageSource().toLowerCase().contains(warningMessage.toLowerCase()) == true){
		//	System.out.println("The Test Passed");
		//}else{
		//	System.out.println("The Test Failed");
		//}
		
		driver.quit();
	}

}



