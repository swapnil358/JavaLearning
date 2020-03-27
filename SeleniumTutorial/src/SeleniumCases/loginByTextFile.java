package SeleniumCases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginByTextFile {

	public static void main(String[] args) throws IOException {
		
		String line = null;
		StringBuilder sbd = new StringBuilder();
		FileReader f = new FileReader("D:\\Selenium\\ReadFile\\TestDataReader.txt");
		
		//D:\\Selenium\\ReadFile
		//FileReader f = new FileReader("C:\\Users\\n\\Desktop\\desktopStuffs\\ReadFile\\TestDataReader.txt");
		
		BufferedReader br = new BufferedReader(f);
		
		try {
			line = br.readLine();
			while(line != null) {
				sbd.append(line);
				sbd.append(" ");
				line = br.readLine();
			//	System.out.println("swapnil br.readLine"+ line);
			}
		}
		finally {
			br.close();
		}
		String[] split = sbd.toString().split("\\s+");
		System.out.println(split);
		
		ArrayList<String> al = new ArrayList<String>();
		for(String str : split) {
			al.add(str);
		}
		System.out.println(al);
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<= al.size()-1; i++) {
			sb.append(al.get(i));
			sb.append(" ");
		}
		//System.out.println(sb);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		
		String[] split1 = sb.toString().split(" ");
		for(int j=2; j<= split1.length-1; j++) {
			if(j%2 ==0) {
				String name = split1[j];
				//System.out.println(name);
				WebElement userName= driver.findElement(By.name("username"));
						   userName.clear();
						   userName.sendKeys(name);
			
			}
			else {
				String pass = split1[j];
				//System.out.println(pass);
				
				WebElement passWord= driver.findElement(By.name("password"));
				   passWord.clear();
				   passWord.sendKeys(pass);
	
			
			}
		}
		
		WebElement submit = driver.findElement(By.xpath(".//input[@class = 'btn btn-small']"));
					submit.click();
		
	}

}
