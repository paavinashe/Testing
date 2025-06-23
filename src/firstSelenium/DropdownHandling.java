package firstSelenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownHandling {
	
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:/webdriver/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practice.expandtesting.com/dropdown");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//WebElement simpledropdown = driver.findElement(By.id("dropdown"));
		
		//simpledropdown.click();
		
		Select S = new Select(driver.findElement(By.id("dropdown")));
		
	    S.selectByVisibleText("Option 2");
	    
	    Thread.sleep(2000);
	    
	    Select s = new Select(driver.findElement(By.id("elementsPerPageSelect")));
	    
	    s.selectByIndex(2);
	    
	    Thread.sleep(2000);
	    
	    WebElement countryselsction = driver.findElement(By.id("country"));
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    js.executeScript("arguments[0].scrollIntoView(true)", countryselsction);
	    
	    Select S1 = new Select(countryselsction);
	    
	    S1.selectByValue("BF");
		
	}

}
