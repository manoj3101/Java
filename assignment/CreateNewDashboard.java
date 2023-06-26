package salesforce.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateNewDashboard {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
		
		//Login to https://login.salesforce.com 
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		
		//Click on the toggle menu button from the left corner
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']/div")).click();
		
		//Click View All and click Dashboards from App Launcher
		driver.findElement(By.xpath("//button[@class='slds-button']/parent::lightning-button")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Dashboards");
		driver.findElement(By.xpath("//mark[text()='Dashboards']")).click();
		
		//Click on the New Dashboard option 
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
		//Enter Name as 'Salesforce Automation by Your Name ' and Click on Create.
		Thread.sleep(500);
		try {
			driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("Salesforce automation by Manoj");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		driver.close();
		//Click on Save and Verify Dashboard name."
		//driver.findElement(By.id("submitBtn")).click();

	}

}
