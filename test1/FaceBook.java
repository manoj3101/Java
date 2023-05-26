package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		//To open the ChromeDriver
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on Create New Account button
		WebElement newAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));		
		newAccount.click();
			
		//Enter the first name
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Manoj");
		
		//Enter last name
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Kumar");
		
		//Enter your mobile number
		WebElement phonenumber= driver.findElement(By.name("reg_email__"));
		phonenumber.sendKeys("9597168039");
	
		//Enter your password
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("Kumar");
		
		// Select  date
		WebElement day = driver.findElement(By.id("day"));
		Select day1=new Select(day);
		day1.selectByVisibleText("31");
		
		// Select month
		WebElement month = driver.findElement(By.id("month"));
		Select month1=new Select(month);
		month1.selectByVisibleText("Jan");
		
		// Select year
		WebElement year = driver.findElement(By.id("year"));
		Select year1=new Select(year);
		year1.selectByVisibleText("2002");
		
		//Click on your Gender
		WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		gender.click();
		
		//Close your Browser
		driver.close();


		

	}

}
