package TestPackage2;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestClass2 {

	WebDriver driver;

	@Test
	public void LoginToAliS() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhardwaj\\eclipse-workspace\\WiproTest\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// JavascriptExecutor is used to scroll down up and down means horizintal or
		// vertical
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("http://172.16.1.32/ALiSDPBH2TESTING11.1.126.04/login.aspx?BusinessUnit=CCP");
		driver.manage().window().maximize();

		WebElement Login = driver.findElement(By.xpath("//input[@id='m_LoginControl_UserName']"));
		WebElement PWd = driver.findElement(By.xpath("//input[@id='m_LoginControl_Password']"));
		WebElement loginbutton = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		
		Thread.sleep(3000);
		Login.sendKeys("Health126prod");
		Thread.sleep(3000);
		PWd.sendKeys("Password@1");
		Thread.sleep(3000);
		loginbutton.click();

		driver.quit();
	}

}
