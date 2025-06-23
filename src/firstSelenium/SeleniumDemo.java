package firstSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver-win64/chromedriver/chromedriver.exe");
		
		//Instantiate chromedriver class
		WebDriver driver = new ChromeDriver();
		
		//Launch the website
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		/*//Scroll down the webpage by 5000 pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,5000)");
		
		//click on java
		driver.findElement(By.xpath("//*[@id=\"link\"]/div/ul/li[3]/a")).click();*/
		
		/*Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
		dropdown.selectByVisibleText("Aruba");*/
		//driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
		  
		  
		//Using Select class for selecting value from dropdown 
		/*Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		action.moveToElement(ele);
		action.clickAndHold(ele);
		ele.click();
		
		//select value from dropdown
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"))); 
		dropdown.selectByIndex(4);*/
		
		WebElement ele = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		ele.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().alert().getText();
		
		
		

	}

}
