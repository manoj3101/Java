package salesforce.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateIndividuals {

	public static void main(String[] args) {		
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
		
		//Click View All and click Individuals from App Launcher
		driver.findElement(By.xpath("//button[@class='slds-button']/parent::lightning-button")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("individuals");
		driver.findElement(By.xpath("//mark[text()='Individuals']")).click();
		//Click on New Individual
		driver.findElement(By.xpath("//div[text()='New']")).click();
		//Enter the Last Name as 'Kumar'
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Kumar");
		//Click save and verify Individuals Name"
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		String text = driver.findElement(By.xpath("//span[@class='uiOutputText']")).getText();
		System.out.println(text);
		if (text.equals("Kumar")) {
			System.out.println("Indidviduals verified");
		} else {
			System.out.println("Indidviduals not  verified");

		}

	}

}
