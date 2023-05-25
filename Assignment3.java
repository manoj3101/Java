package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// Load url "https://acme-test.uipath.com/login"
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		// Enter email as "kumar.testleaf@gmail.com"
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("kumar.testleaf@gmail.com");
		// Enter Password as "leaf@12"
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("leaf@12");
		// Click login button
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		// Get the title of the page and print
		String title = driver.getTitle();
		System.out.println("Title : "+ title);
		// Click on Log Out
		WebElement logout = driver.findElement(By.xpath("//a[@href='https://acme-test.uipath.com/logout']"));
		logout.click();
		// Close the browser (use -driver.close())
		driver.close();

	}

}
