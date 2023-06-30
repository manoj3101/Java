package test2.lastweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		//		01) Launch  Chrome browser 
		//	add  implicitlyWait
		//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//	02) Load https://www.abhibus.com/
		//	03) Click on Bus
		//	04) Type "Chennai" in the FROM text box
		//	05) Click the first option from the pop up box
		//	06) Type "Bangalore" in the TO text box
		//	07) Click the first option from the pop up box
		//	08) Select tomorrow's date in the Date field
		//	09) Click Search Buses
		//	09) Print the name of the first resulting bus (use .getText())
		//	10) Choose SLEEPER in the left menu from Bus Type
		//	11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		//	12) Click SelectSeat
		//	13) Choose any one Available seat
		//	14) Print Seats Selected ,Total Fare
		//	15) Select Boarding Point  and Dropping Point
		//	16) Get the Title of the page(use .getTitle())
		//	17) Close the browser
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver =new ChromeDriver(option);
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//li[text()='Chennai'])[1]")).click();
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("(//li[text()='Bangalore'])[1]")).click();
		driver.findElement(By.id("datepicker1")).click();
        driver.findElement(By.xpath("//a[text()='1']")).click();
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        WebElement name = driver.findElement(By.xpath("(//h2[@class='TravelAgntNm ng-binding'])[1]"));
        System.out.println("Bus name :"+name.getText());
        driver.findElement(By.xpath("(//input[@name='Bustypes'])[4]")).click();
        WebElement seat = driver.findElement(By.xpath("(//div[@class='search-column2-col1'])[1]"));
        System.out.println("Number of seat : "+seat.getText());
        driver.findElement(By.xpath("(//span[text()='Select Seat'])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[1]")).click();
        WebElement selected = driver.findElement(By.xpath("(//div[@class='clearfix'])[4]"));
        System.out.println("selected seat :"+selected.getText());
        WebElement fare = driver.findElement(By.xpath("(//div[@class='clearfix'])[5]"));
        System.out.println("Total Fare :"+fare.getText());
        WebElement boarding = driver.findElement(By.xpath("(//select[@class='dropdown_custom'])[1]"));
        Select boardingpt =new Select(boarding);
        boardingpt.selectByIndex(1);
        WebElement dropping = driver.findElement(By.xpath("(//select[@class='dropdown_custom'])[2]"));
        Select droppingpt =new Select(dropping);
        droppingpt.selectByIndex(1);
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
        
	}

}
