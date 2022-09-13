package TestPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest   {
	WebDriver driver;
	
	public static void main(String args[]) throws Exception {
	
       System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhardwaj\\eclipse-workspace\\WiproTest\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://172.16.1.32/ALISSELFSERVICE2TESTING11.2.5/ALiSLogin.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebElement Login = driver.findElement(By.xpath("//input[@id='m_LoginControl_UserName']"));
		WebElement PWd = driver.findElement(By.xpath("//input[@id='m_LoginControl_Password']"));
		WebElement loginbutton = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		Login.sendKeys("BEWIZARD11.2.5");
		PWd.sendKeys("Password@2");
		loginbutton.click();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbutton);
		
		
		js.executeScript("alert('API is a reuired field ');");   
		Thread.sleep(4000);
		 Alert alert= driver.switchTo().alert();
		 alert.getText();
		//alert.accept();
	
		
	boolean turnedOn= true;
	if (turnedOn) {
		System.out.println("System able to Execute Js ");
	}
		
	else {
		System.out.println("Not able to Execute js ");
		System.out.println("Hi to test only");
	}
		
	}
}
	
	
	


