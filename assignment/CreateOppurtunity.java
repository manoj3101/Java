package salesforce.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateOppurtunity {

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
		option.addArguments("--disable-notifications");

		//Click on Opportunities tab 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		js.executeScript("arguments[0].click();", ele);

		//Click on New button 
		driver.findElement(By.xpath("//div[text()='New']")).click();
		//Enter Opportunity name as 'Salesforce Automation by Your Name,Get the text and Store it
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Manoj");
		//Choose close date as Today 
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("6/26/2023");

		WebElement value = driver.findElement(By.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click'])[2]"));
		value.click();
		Thread.sleep(2000);

		//Select 'Stage' as Needs Analysis
		driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]")).click();
		//click Save and VerifyOppurtunity Name"
		driver.findElement(By.xpath("//button[text()='Save']")).click();


	}

}
