package seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.extrapolate.com/");
		
		driver.manage().window().maximize();
		
		//Find the broken links
        List<WebElement> links = driver.findElements(By.tagName("a"));
		// Print total number of links
        System.out.println("Total number of links below the latestlink ----> " + links.size());
        //test.log(LogStatus.INFO, "Test case find broken links of latestpage has staretd");
        //test.log(LogStatus.INFO,"The total number of links on the latestpage are printed in the console");
        //Actions actions = new Actions(driver);
		for (WebElement link : links) {
			 /*actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
			 Thread.sleep(1000);*/
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
		            if (huc.getResponseCode() == 200) {
		            	System.out.println(url + " _ " + huc.getResponseCode() + " _ " + huc.getResponseMessage());
		            } else {
		                System.err.println(url + " _ " + huc.getResponseCode() + " _ " + huc.getResponseMessage());
		            }
		            huc.disconnect();
		        } else {
		            System.out.println(url + " is not an HTTP link");
		        }
		    }catch (IOException e) {
		        System.err.println("Error connecting to URL: " + url);
		    }
		}
		
		
	}

}
