package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) {
		//Open driver
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://leafground.com/select.xhtml");
		
		//maximize
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		
		driver.findElement(By.xpath("//a[@class='rotated-icon']")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		
		String title = driver.getTitle();
		System.out.println("Title : "+title);
		
		
		

	}

}
