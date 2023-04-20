package cia1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Question2 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Verified title of the page");
		}else {
			System.out.println("Title not matched");
		}
		
    	
    	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		System.out.println("Searched Item successfully");
		
		driver.findElement(By.id("a-autoid-0-announce")).click();
List<WebElement>li=driver.findElements(By.xpath("//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[2]/span/div/div[2]/div[1]/a"));
		for(WebElement link:li) {
			System.out.println(link.getText());
		}
		System.out.println("User is able to filter by search");

		System.out.println("Testing Ended");
		
    	driver.quit();
    }
}

