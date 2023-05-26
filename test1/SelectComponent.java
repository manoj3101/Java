package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectComponent {

	public static void main(String[] args) {
		//Open driver
				ChromeDriver driver = new ChromeDriver();
				//Load URL
				driver.get("https://leafground.com/select.xhtml");
				
				//maximize
				driver.manage().window().maximize();		
		//Select tool
				WebElement selecttool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
				Select tool = new Select(selecttool);
				tool.selectByIndex(1);
				
				//Select Country
				WebElement selectcountry = driver.findElement(By.xpath("//select[@name='j_idt87:country_input']"));
				Select country = new Select(selectcountry);
				country.selectByVisibleText("India");

	}

}
