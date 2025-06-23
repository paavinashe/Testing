package et;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ClickOndynamiclinks {
	ExtentReports extent;  //Specify the location of the report
	ExtentTest test;       //what details should be populated in the report

	    public static void main(String[] args) throws InterruptedException, IOException {
		//set the path to chromedriver
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver-win64/chromedriver/chromedriver.exe");
		
		// initialize the webdriver insatance
		WebDriver driver = new ChromeDriver();
		
		//open the webpage
		driver.get("https://enterprisetalk.com/");
		
		//maximaze the window
		driver.manage().window().maximize();
		
		//click on the lataestlink
		/*WebElement element=driver.findElement(By.id("basic-nav-dropdown key1"));
		element.click();*/
		
		//click on the lataestlink
		WebElement latestlink = driver.findElement(By.xpath("(//div[@class='custom-dropdown hover-underline-animation fw-bold nav-item dropdown'])[1]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].setAttribute('style','background: yellow;border: 2px solid red');", latestlink);
		latestlink.click();
		System.out.println("The total number of links below the latestlink ---->" +latestlink.findElements(By.tagName("a")).size());
		
		for(int i=0;i<latestlink.findElements(By.tagName("a")).size();i++)
		{
			String opentabs = Keys.chord(Keys.CONTROL,Keys.ENTER);
			latestlink.findElements(By.tagName("a")).get(i).sendKeys(opentabs);
		}
		//driver.navigate().refresh();
		/*List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link : links) 
		{
			String linkURL = link.getAttribute("href");
			URL url = new URL(linkURL);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();
			
			if(httpURLConnection.getResponseCode()==200) 
			
				System.out.println(linkURL + " - " + httpURLConnection.getResponseCode() +" - " + httpURLConnection.getResponseMessage());
			else
				System.err.println(linkURL + " - " + httpURLConnection.getResponseCode() +" - " + httpURLConnection.getResponseMessage());
			    httpURLConnection.disconnect();
		}*/
		/*List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			if(url==null || url.isEmpty()) 
			{
				System.out.println("url is empty");
				continue;
			}
			
			try {
				HttpURLConnection huc = (HttpURLConnection)new URL(url).openConnection();
				huc.connect();
				if(huc.getResponseCode()>=400) 
				{
					System.out.println(url+" is broken");
				}
				else 
				{
					System.out.println(url+"is not broken");
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// Print total number of links
        System.out.println("Total number of links on the latestpage ----> " + links.size());
		for (WebElement link : links) {
		    String url = link.getAttribute("href");
		    if (url == null || url.isEmpty()) {
		        System.out.println("URL is empty");
		        continue;
		    }
		    try {
		        URL linkUrl = new URL(url);
		        if ("http".equals(linkUrl.getProtocol()) || "https".equals(linkUrl.getProtocol())) {
		            HttpURLConnection huc = (HttpURLConnection) linkUrl.openConnection();
		            huc.setRequestMethod("HEAD");
		            huc.connect();
		            if (huc.getResponseCode() >= 400) {
		            	System.out.println(url + "\u001B[31m is broken" + "\u001B[0m");
		            } else {
		                System.out.println(url + " is not broken");
		            }
		            huc.disconnect();
		        } else {
		            System.out.println(url + " is not an HTTP link");
		        }
		    } catch (MalformedURLException e) {
		        System.out.println("Malformed URL: " + url);
		    } catch (IOException e) {
		        System.out.println("Error connecting to URL: " + url);
		    }
		}
		// Scroll vertically down the page until the element is visible
		WebElement guestAuthor = driver.findElement(By.xpath("//h3[@class='fw-bold  py-1 h4 container mt-5 container-max borderB']"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true);",guestAuthor);
		
		//Highlight the element
		j.executeScript("arguments[0].setAttribute('style','background: lightgreen ;border:2px solid black')",guestAuthor );
		 try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
		//scroll horizontally right
		j.executeScript("window.scrollBy(1000,0);");
		 try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
		// Scroll horizontally left
		j.executeScript("window.scrollBy(-1000,0)");
		 try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
		// Scroll back up to the top of the page
		
		// Scroll down the page until the element is visible
		WebElement OtherPublication = driver.findElement(By.xpath("//p[@class='mt-2']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",OtherPublication );
		// Highlight the element
		js.executeScript("arguments[0].setAttribute('style','background: yellow;border:2px solid red');", OtherPublication);
		// Wait for a brief moment to visually observe the highlighted element
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Scroll back up to the top of the page
        j.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement leadershiplink = driver.findElement(By.xpath("(//div[@class='custom-dropdown hover-underline-animation fw-bold nav-item dropdown'])[2]"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
        js1.executeScript("arguments[0].setAttribute('style','background: orange;border: 2px solid green');", leadershiplink);
        leadershiplink.click();
        System.out.println(leadershiplink.findElements(By.tagName("a")).size());
        
        for(int i=0;i<leadershiplink.findElements(By.tagName("a")).size();i++)
        {
        	String opentabs = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	leadershiplink.findElements(By.tagName("a")).get(i).sendKeys(opentabs);
        }
        //Thread.sleep(3000);
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement featureslink = driver.findElement(By.xpath("(//div[@class='custom-dropdown hover-underline-animation fw-bold nav-item dropdown'])[3]"));
        JavascriptExecutor jsE = (JavascriptExecutor)driver;
        jsE.executeScript("arguments[0].setAttribute('style','background: green;border:3px solid brown');",featureslink);
        featureslink.click();
        System.out.println(featureslink.findElements(By.tagName("a")).size());
        
        for(int i=0;i<featureslink.findElements(By.tagName("a")).size();i++)
        {
        	String opentabs = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	featureslink.findElements(By.tagName("a")).get(i).sendKeys(opentabs);
        }
        
        // To 
        
        

		
		
		

	
}

	  

}
