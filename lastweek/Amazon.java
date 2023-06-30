package test2.lastweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		//		01) Launch Chrome  
		//	02) Load https://www.amazon.in/
		//	     add  implicitlyWait
		//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//	03) Type "Bags" in the Search box
		//	04) Choose the 	 item in the result (bags for boys)
		//	05) Print the total number of results (like 50000)
		//	    1-48 of over 50,000 results for "bags for boys"
		//	06) Select the first 2 brands in the left menu
		//	    (like American Tourister, Generic)
		//	07) Choose New Arrivals (Sort)
		//	08) Print the first resulting bag info (name, discounted price)
		//	09) Get the page title and close the browser(driver.close())
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for mens']")).click();
		WebElement text = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
		System.out.println("Number of Results :"+text.getText());	
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		WebElement text2 = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small'])[1]"));
		System.out.println("Bag Info :"+text2.getText());		
		driver.close();


	}

}
