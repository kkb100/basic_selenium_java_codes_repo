package eCommerce_Level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EcomLoginPage {
	
		
		private WebDriver driver;
		

		public EcomLoginPage (WebDriver driver){
			this.driver = driver;
			
		}
		
		public void loadingBrowser(){
			driver.manage().window().maximize();		
		}
		 
		public void enterUrl(){
			driver.get("http://live.guru99.com");
		}
		
		public void loginIn () {
			
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
					
		}
		
		
		public void closeTest(){
			driver.quit();
		}

		
		
		
		
	
	
	
	
	

}
