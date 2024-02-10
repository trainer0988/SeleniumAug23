package basicsSelenium;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterData {
public static WebDriver driver;
	
	public static void main(String[] args ) throws InterruptedException, AWTException {
	//
	
	driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	String parentWindowId = driver.getWindowHandle();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//driver.findElement(By.id("APjFqb")).sendKeys(Keys.SHIFT,"ashutosh");
	
	((JavascriptExecutor)driver).
	executeScript("document.getElementById('APjFqb').value = 'Ashutosh'");
	

	
	
	}

	
}
