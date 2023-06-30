package test2.lastweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		//		01) Launch the Url  https://www.pvrcinemas.com/
		//			02) Click  on Movie Library
		//			03) Select the City -->chennai
		//			04) Select the Genre-->Animation
		//			05) Select the Language-->english
		//			06) Click on Apply
		//			07) Click on first resulting animation movie
		//			08) Click proceed to book
		//			09) Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		//			10) Click on copy to self 
		//			11) Click on  Send Request
		//			12) Click cancel 
		//			13) Close the OTP dialog
		//			14) Verify the ttile of the page
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver =new ChromeDriver(option);
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
		WebElement city = driver.findElement(By.name("city"));
		Select chennai =new Select(city);
		chennai.selectByVisibleText("Chennai");
		WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));
		Select anime =new Select(genre);
		anime.selectByVisibleText("ANIMATION");
		WebElement lang = driver.findElement(By.xpath("//select[@name='lang']"));
        Select english =new Select(lang);
        english.selectByVisibleText("ENGLISH");
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted']//div[1])[1]")).click();
        driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();

        WebElement cinema = driver.findElement(By.id("cinemaName"));
        Select cinema1 = new Select(cinema);
        cinema1.selectByVisibleText("PVR Heritage RSL ECR Chennai");
        WebElement time = driver.findElement(By.name("timings"));
        Select timing = new Select(time);
        timing.selectByVisibleText("09:00 AM - 12:00 PM");
        driver.findElement(By.name("noOfTickets")).sendKeys("1");
		driver.findElement(By.name("name")).sendKeys("Manoj kumar");
		driver.findElement(By.name("email")).sendKeys("smanoj3101@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("9597168039");
		WebElement food = driver.findElement(By.name("food"));
		Select food1 =new Select(food);
		food1.selectByIndex(1);
		driver.findElement(By.name("comment")).sendKeys("NA");
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
       
        
        
	}

}
