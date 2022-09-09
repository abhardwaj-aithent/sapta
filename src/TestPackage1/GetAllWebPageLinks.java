package TestPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllWebPageLinks {
	
	WebDriver driver;
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhardwaj\\eclipse-workspace\\WiproTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://172.16.1.32/ALISSELFSERVICE2TESTING11.2.5/ALiSLogin.aspx");
	    WebElement Login=driver.findElement(By.id(""));
		
		driver.manage().window().maximize();
		
	
		
		/*
		 * List<WebElement> getlinks=driver.findElements(By.tagName("p"));
		 * 
		 * for(WebElement link:getlinks) { System.out.println(link.getText() + "-"
		 * +link.getAttribute("style")); }
		 */
		
		//driver.quit();
		
		
	}
	
	

}
