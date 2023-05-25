package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa = driver.findElement(By.id("label"));
		crmsfa.click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		findLeads.click();
		WebElement phone = driver.findElement(By.linkText("Phone"));
		phone.click();
		WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
		phoneNumber.sendKeys("91");
		WebElement FindLeads1 = driver.findElement(By.id("ext-gen334"));
		FindLeads1.click();
		 Thread.sleep(3000);
		 //capture id
		 WebElement id1 = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tr[1]//td[1]//a)[1]"));
		 String leadId = id1.getText();
	     id1.click();
	     
	    WebElement delLead = driver.findElement(By.linkText("Delete"));
	    delLead.click();
	    WebElement findLeads1 = driver.findElement(By.linkText("Find Leads"));
		findLeads1.click();
		WebElement leadId1=driver.findElement(By.name("id"));
		leadId1.sendKeys(leadId);
		WebElement FindLeads2 = driver.findElement(By.id("ext-gen334"));
		FindLeads2.click();
		 Thread.sleep(3000);
		 WebElement display1 = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		 String verify = display1.getText();
		 if(verify.equalsIgnoreCase("No records to display")) {
			 System.out.println(leadId+" is deleted");
		 }else {
			 System.out.println(leadId+" is not deleted");
		 }
				
		
	}
}

