package eCommerce_Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class EcomLoginPage {
	
		
		private WebDriver driver;
		public EcomLoginPage (WebDriver driver){
			this.driver = driver;
			
			}
		
		public void loadingBrowser(){
			driver.manage().window().maximize();		
			}
		 
		public void enterUrl(String url){
			driver.get(url);
		}
		
		
		public void loginIn (String username, String password) {
			
			driver.findElement(By.xpath("//*[@id='header']/div/div[2]/div/a/span[2]")).click();
			driver.findElement(By.xpath("//*[@id='header-account']/div/ul/li[6]/a")).click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			driver.findElement(By.id("email")).sendKeys(username);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		WebElement password_field =	driver.findElement(By.id("pass"));
		password_field.sendKeys(password);
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
					
		}
		
		
		//logOut
		public void logOut() {
		
			driver.findElement(By.xpath("//*[@id='header']/div/div[2]/div/a/span[2]")).click();
			driver.findElement(By.xpath("//*[@id='header-account']/div/ul/li[5]/a")).click();	
		}
		
		//Invalid password log
		public void invalidPasswordLogin(String username, String password) {
			driver.findElement(By.xpath("//*[@id='header']/div/div[2]/div/a/span[2]")).click();
			driver.findElement(By.xpath("//*[@id='header-account']/div/ul/li[6]/a")).click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.id("email")).sendKeys(username);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement password_field =	driver.findElement(By.id("pass"));
			password_field.sendKeys(password);
			
			
			driver.findElement(By.id("send2")).click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		public void tearDown(){
			driver.quit();
		}

		
		
		
		
	
	
	
	
	

}
