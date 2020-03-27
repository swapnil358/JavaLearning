package SeleniumTutorial;

//Refer video - https://youtu.be/PUanHXTSlR8?list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT	

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		//1. alerts - JavaScript pop up -- alert APT (accept, dismiss)
		//2. FIle upload pop up --Browse button (type = file.sendkeys(path))
		//3. Browse window pop up -- Advertisement pop up (Window handler API) - getWindowHandles()
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String ParentWindowId = it.next();
		System.out.println("Parent window id:"+ParentWindowId);
		
		String ChildWIndowId = it.next();
		System.out.println("Child window id:"+ChildWIndowId);
		
		driver.switchTo().window(ChildWIndowId);
		System.out.println("Child window title:"+driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(ParentWindowId);
		
		Thread.sleep(3000);
		System.out.println("Parent window title:"+driver.getTitle());
		driver.close();
	}

}
