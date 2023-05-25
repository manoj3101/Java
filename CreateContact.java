package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		 ChromeDriver driver =new ChromeDriver();
		 //Launch URL "http://leaftaps.com/opentaps/control/login"
		 driver.get("http://leaftaps.com/opentaps/control/login");		 
		  //Enter UserName and Password Using Id Locator
		 driver.manage().window().maximize();
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("DemoSalesManager");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("crmsfa");
		  //Click on Login Button using Class Locator
			WebElement login = driver.findElement(By.className("decorativeSubmit"));
			login.click();
		  //Click on CRM/SFA Link
			WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
			crmsfa.click();
		  //Click on contacts Button
			WebElement contact = driver.findElement(By.linkText("Contacts"));
			contact.click();
		  //Click on Create Contact
			WebElement createcontact = driver.findElement(By.linkText("Create Contact"));
			createcontact.click();
		  //Enter FirstName Field Using id Locator
			WebElement firstNameField = driver.findElement(By.id("firstNameField"));
			firstNameField.sendKeys("Manoj");
		 //Enter LastName Field Using id Locator
			WebElement lastNameField = driver.findElement(By.id("lastNameField"));
			lastNameField.sendKeys("Kumar S");
		  //Enter FirstName(Local) Field Using id Locator
			WebElement createContactForm_firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
			createContactForm_firstNameLocal.sendKeys("Manoj");
			//Enter LastName(Local) Field Using id Locator
			WebElement createContactForm_lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
			createContactForm_lastNameLocal.sendKeys("Kumar");
		 // Enter Department Field Using any Locator of Your Choice
			WebElement departmentName = driver.findElement(By.name("departmentName"));
			departmentName.sendKeys("Testing");
		 //Enter Description Field Using any Locator of your choice 
			WebElement description = driver.findElement(By.name("description"));
			description.sendKeys("I am Manoj Kumar");
		  //Enter your email in the E-mail address Field using the locator of your choice
			WebElement primaryEmail = driver.findElement(By.id("createContactForm_primaryEmail"));
			primaryEmail.sendKeys("smanoj3101@gmail.com");
		  //Select State/Province as NewYork Using Visible Text
			WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			Select state1= new Select(state);
			state1.selectByVisibleText("New York");
			
		  //Click on Create Contact
			WebElement submitButton = driver.findElement(By.name("submitButton"));
			submitButton.click();
		  //Click on edit button
			WebElement edit = driver.findElement(By.className("subMenuButton"));
			edit.click();
		 //Clear the Description Field using .clear
			WebElement clear = driver.findElement(By.id("updateContactForm_description"));
			clear.clear();
		  //Fill ImportantNote Field with Any text
			WebElement importantNote = driver.findElement(By.name("importantNote"));
			importantNote.sendKeys("Hii This is Manoj");
		 //Click on update button using Xpath locator
			WebElement update = driver.findElement(By.xpath("//input[@value='Update']"));
			update.click();
		 //Get the Title of Resulting Page.
			String title = driver.getTitle();
			System.out.println( "Title :" +title);

	}

}
