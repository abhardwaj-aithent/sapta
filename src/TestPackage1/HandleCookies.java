package TestPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies {

	WebDriver driver;
	public static void main(String args[]) throws Exception {
		
	       System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\abhardwaj\\eclipse-workspace\\WiproTest\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.infosys.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			
			WebElement acceptcookie= driver.findElement(By.id("onetrust-accept-btn-handler"));
			acceptcookie.click();
			
			boolean turnedOn= true;
			if(turnedOn){
				
				System.out.println("System is able to accept browsercookie");
				driver.quit();
				
			}
			

		/*	
			Set<Cookie> getallcookies =driver.manage().getCookies();
		
			
			System.out.println("Count for all cookie are :-"+getallcookies);
			
			for (Cookie cookie : getallcookies)
			{
				System.out.println("Size of a Cookie "+cookie.getValue());
				System.out.println("Name of a Cookie:- "+cookie.getName());
				System.out.println("Domain of a Cookie:- "+cookie.getDomain());
				System.out.println("========================================");
				
				
			}
			
	*/		
			
	}
}
