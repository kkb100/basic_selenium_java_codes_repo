package faceBook1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignUpHome {
	
	
	private WebDriver driver;


	public FaceBookSignUpHome (WebDriver driver){
		
		this.driver = driver;
	}
	
	
	public void dateOfBirthSelector (){
	WebElement day = driver.findElement(By.id("day"));
	Select selectday = new Select(day);
	selectday.selectByIndex(4);
	
	WebElement month = driver.findElement(By.id("month"));
	Select selectmonth = new Select(month);
	selectmonth.selectByIndex(7);
	
	WebElement year = driver.findElement(By.id("year"));
	Select selectyear = new Select(year);
	selectyear.selectByVisibleText("1905");
		
	}
	
	public void openUrlSignIn() {
	driver.get("https://www.facebook.com/");
	
	}
	
	public void genderSelector() {
	WebElement gender = driver.findElement(By.id("u_0_h"));
	gender.click();
	}

	public void clickButton () {
	WebElement createAccunt = driver.findElement(By.id("u_0_e"));
	createAccunt.click();
	
	}
	
	
	
	
	
}
