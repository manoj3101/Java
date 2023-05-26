package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {

	public static void main(String[] args) {
		//open chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//load the URL
		driver.get("https://www.tamilmatrimony.in/");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Select the Matrimony profile for YourSelf
		WebElement registermyself = driver.findElement(By.id("REGISTERED_BY"));
		Select myself = new Select(registermyself);
		myself.selectByVisibleText("Myself");
		
		//Enter Name
		WebElement name = driver.findElement(By.id("NAME"));
		name.sendKeys("MANOJ KUMAR S");
		
		//Click on Gender
		WebElement gender = driver.findElement(By.xpath("//input[@value='M']"));
		gender.click();
				
		//Select your Date of Birth
		WebElement day = driver.findElement(By.id("DOBDAY"));
		Select day1=new Select(day);
		day1.selectByVisibleText("31");
		
		// Select month
		WebElement month = driver.findElement(By.id("DOBMONTH"));
		Select month1=new Select(month);
		month1.selectByVisibleText("Jan");
		
		// Select year
		WebElement year = driver.findElement(By.id("DOBYEAR"));
		Select year1=new Select(year);
		year1.selectByVisibleText("2002");
		// Select your Religion
		WebElement religion = driver.findElement(By.id("RELIGION"));
		Select religion1= new Select(religion);
		religion1.selectByVisibleText("Hindu");
		
		//Select your Mother Tongue
		WebElement mothertongue = driver.findElement(By.id("MOTHERTONGUE"));
		Select mothertongue1= new Select(mothertongue);
		mothertongue1.selectByVisibleText("Tamil");
		
		// Select your country
		WebElement country = driver.findElement(By.id("COUNTRY"));
		Select country1= new Select(country);
		country1.selectByVisibleText("India");
		
		// Enter your MobileNumber
		WebElement countryid = driver.findElement(By.id("M_COUNTRYCODE"));
		Select countryid1= new Select(countryid);
		countryid1.selectByVisibleText("+91");
		
		WebElement number = driver.findElement(By.id("MOBILENO"));
		number.sendKeys("9597168039");
		
		//Enter your E-mail ID
		WebElement email = driver.findElement(By.id("EMAIL"));
		email.sendKeys("9597168039");
		
		//Close the Browser
		//driver.close();



	}

}
