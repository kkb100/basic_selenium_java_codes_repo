package thirdAutomation;

import org.openqa.selenium.WebDriver;

public class Nickson1 {
	
	private WebDriver driver;

	public Nickson1 (WebDriver driver){
		this.driver = driver;
	}
	
	public void openWindow(){
		driver.manage().window();
	}
	
	public void enterUrl(){
		driver.navigate().to("https://riouxsvn.com/login/");
	}
	
	public void delay () throws InterruptedException{
		Thread.sleep(3000);
	}
	
	public void close(){
		driver.close();
	}
	
	
	
	

}
