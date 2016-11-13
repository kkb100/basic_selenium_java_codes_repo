package faceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	// Creating a class variable for the driver object
	private WebDriver driver;

    //Creating a constructor and pass the web driver objects 
	public HomePage (WebDriver driver){
		this.driver = driver;
	}
	
	//Method to open a full screen 
	public void openWindow(){
		driver.manage().window().maximize();
	}
	
	//method to enter a Url
	public void enterUrl(){
		driver.get("https://www.facebook.com");
	}
	
	//method to logon to a user account
	
	public void loginWith(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		WebElement signIn_button = driver.findElement(By.id("u_0_n"));
		boolean answer = signIn_button.isDisplayed();
		
		if(answer == true) {
		signIn_button.click();}
	     
		else {
			System.out.println("The button is not present");
		}
	}
	
	//Method that close the window
	public void closeWindows() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.quit();
		
	}

}
