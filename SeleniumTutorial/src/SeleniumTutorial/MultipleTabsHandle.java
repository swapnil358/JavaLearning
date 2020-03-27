package SeleniumTutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsHandle {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String ParentWindowId = it.next();

		System.out.println("Parent window id:" + ParentWindowId);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);

//		String ChildID = it.next();
//		System.out.println(ChildID);

		driver.switchTo().window(ParentWindowId);

	}

}
