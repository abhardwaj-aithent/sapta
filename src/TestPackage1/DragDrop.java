package TestPackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

WebDriver driver;
	
	public static void main(String args[]) throws Exception {
	
       System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhardwaj\\eclipse-workspace\\WiproTest\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://172.16.1.32/ALiSDPBH2TESTING11.1.127/login.aspx?BusinessUnit=HCQC");
		driver.manage().window().maximize();
		
		WebElement login= driver.findElement(By.xpath("//input[@id='m_LoginControl_UserName']"));
		WebElement pwd= driver.findElement(By.xpath("//input[@id='m_LoginControl_Password']"));
		
		
		login.sendKeys("admin");
		pwd.sendKeys("password");
		
		WebElement Btn= driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		Btn.click();
		

		WebElement hover=driver.findElement(By.xpath("//a[contains(text(),'Licensing')]"));
		
		//Action class will used to Perform drag and drop fuction
		Actions act=new Actions(driver);
		
		act.moveToElement(hover);
		
		
		WebElement src= driver.findElement(By.xpath("//span[contains(text(),'Select')]"));
		
		WebElement dest= driver.findElement(By.xpath("//span[contains(text(),'Name')]"));
		
		act.clickAndHold(src)
		.pause(Duration.ofSeconds(2))
		.moveToElement(dest)
		.pause(Duration.ofSeconds(2))
		.release()
		.build()
		.perform();
		
		
	
	}
	
}
