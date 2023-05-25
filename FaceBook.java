package week4.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Step 6: Click on Create New Account button
		WebElement newAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));		
		newAccount.click();
			
		// Step 7: Enter the first name
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Manoj");
		
		// Step 8: Enter the last name
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Kumar");
		
		// Step 9: Enter the mobile number
		WebElement mobileno = driver.findElement(By.name("reg_email__"));
		mobileno.sendKeys("9597168039");
		
		// Step 10: Enter the password
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("9597168039");
		
		// Step 11: Handle all the three drop downs
		WebElement day = driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		day1.selectByVisibleText("31");
		
		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("2001");
		
		// Step 12: Select the radio button "Female" 
		            //( A normal click will do for this step) 
		WebElement sex = driver.findElement(By.xpath("//input[@name='sex']"));
		sex.click();

	}

}
