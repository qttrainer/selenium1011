package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class OpenBrowser {
	
	int sum =0;
	
	public static void main(String... args) 
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\executable\\chromedriver.exe");
		System.getProperty("user.dir");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		
		//Mouse Hover
		/*
		WebElement men = driver.findElement(By.xpath("//a[contains(text(),'Men')]"));		
		Actions action = new Actions(driver);
		action.moveToElement(men).build().perform();
		
		*///to do:
		// 1. mouse hover on all menu
		//2. click on login
		
		Actions action = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		//action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("1234").keyUp(Keys.SHIFT).build().perform();
		action.contextClick().perform();
	
		
		
				
		
		
	}
	
	

}
