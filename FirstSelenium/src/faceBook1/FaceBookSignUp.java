package faceBook1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookSignUp {

	public static void main(String[] args) {
		
		String geckoPath = "C:\\Automation\\projects\\Java_projects\\FirstSelenium\\drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe";	
		System.setProperty("webdriver.gecko.driver", geckoPath);
		
		WebDriver driver = new FirefoxDriver();
		
		FaceBookSignUpHome  facebooksignuphome = new FaceBookSignUpHome(driver);
		
		
		facebooksignuphome.openUrlSignIn();
		facebooksignuphome.dateOfBirthSelector();
		facebooksignuphome.genderSelector();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		facebooksignuphome.clickButton();
		
		
		
	}

}
