package salesforce.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccounts {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
		//Login to https://login.salesforce.com 
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();

		//Click on toggle menu button from the left corner
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']/div")).click();

		//Click view All and click Sales from App Launcher		
		driver.findElement(By.xpath("//button[@class='slds-button']/parent::lightning-button")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		//Click on Accounts tab	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));
		js.executeScript("arguments[0].click();", ele);


		//Click on New button 
		driver.findElement(By.xpath("//div[text()='New']")).click();

		//Enter 'your name' as account name 
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Manojkumar");

		//Select Ownership as Public
		WebElement dropDown = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]"));
		dropDown.click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();

		//Click save and verify Account name "
		driver.findElement(By.xpath("//button[text()='Save']")).click();

	}

}
