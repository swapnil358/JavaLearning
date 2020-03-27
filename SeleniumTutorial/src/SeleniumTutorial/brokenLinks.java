package SeleniumTutorial;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {
	
	
	
	/*
	 * How to check the Broken Links and images For checking the broken links,
	 * you will need to do the following steps.
	 * 
	 * 1. Collect all the links in the web page based on <a> tag. 
	 * 2. Send HTTP request for the link and read HTTP response code.
	 * 3. Find out whether the link is valid or broken based on HTTP response code. 
	 * 4. Repeat this for all the links captured.
	 */
	/*
	 * Step 1: Import Packages : 
	 * import java.net.HttpURLConnection;
	 * 
	 * 
	 * Step 2: Collect all links in web page
	 * List<WebElement> links = driver.findElements(By.tagName("a"));
	 * 
	 * Obtain Iterator to traverse through the List.
	 * 
	 * Iterator<WebElement> it = links.iterator();
	 * 
	 * 
	 * Step 3: Identifying and Validating URL
	 * In this part, we will check if URL belongs to Third party domain or whether URL is empty/null.
	 * 
	 * Get href of anchor tag and store it in url variable.
	 * url = it.next().getAttribute("href");
	 * 
	 * Check if URL is null or Empty and skip the remaining steps if the condition is satisfied.
	 * 
	 * if(url == null || url.isEmpty()){
              System.out.println("URL is either not configured for anchor tag or it is empty");
              continue;
     }
	 *
	 * 
	 * Check whether URL belongs to a main domain or third party. Skip the remaining steps if it belongs to third party domain.
	 *  if(!url.startsWith(homePage)){
           System.out.println("URL belongs to another domain, skipping it.");
           continue;
           }
	 * 
	 * Step 4: Send http request
	 * HttpURLConnection class has methods to send HTTP request and capture HTTP response code. 
	 * So, output of openConnection() method (URLConnection) is type casted to HttpURLConnection.
	 * 
	 * huc = (HttpURLConnection)(new URL(url).openConnection());
	 * 
	 * We can set Request type as "HEAD" instead of "GET". So that only headers are returned and not document body.
	 * huc.setRequestMethod("HEAD");
	 * 
	 * On invoking connect() method, actual connection to url is established and the request is sent.
	 * huc.connect();
	 * 
	 * Step 5: Validating Links
	 * Using getResponseCode() method we can get response code for the request
	 * respCode = huc.getResponseCode();
	 * 
	 * Based on response code we will try to check link status.
	 * 
	 * if(respCode >= 400){
        System.out.println(url+" is a broken link");
		}
		else{
        System.out.println(url+" is a valid link");
		}
		Thus, we can obtain all links from web page and print whether links are valid or broken.
	 * 
	 */
	
	
	
	private static WebDriver driver = null;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String homePage = "http://www.zlti.com";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get(homePage);
        
        
       // Step 2: Collect all links in web page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
        //Step 3: Identifying and Validating URL
            url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
            if(!url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
            
            try {
        //Step 4: Send http request
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
       //Step 5: Validating Links
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        driver.quit();

    }
}
	


