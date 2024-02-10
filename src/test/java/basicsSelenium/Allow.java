package basicsSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Allow {
public static WebDriver driver;
	
	public static void main(String[] args ) throws InterruptedException, AWTException {
	//
	
	driver = new ChromeDriver();
	
	driver.get("https://www.axisbank.com/");
	
	String parentWindowId = driver.getWindowHandle();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath(("//div[@id = 'nvpush_cross']"))).click();
	

	//Actions action = new Actions(driver);
	//action.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).build().perform();
	//action.sendKeys(Keys.ESCAPE).build().perform();
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ESCAPE);
	
	driver.get(driver.getCurrentUrl());
	
	//robot.keyPress(KeyEvent.VK_F5);
	
	}
}
