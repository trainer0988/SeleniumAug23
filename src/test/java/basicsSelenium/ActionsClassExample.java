package basicsSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExample {
public static WebDriver driver;
	
	public static void main(String[] args ) throws InterruptedException, IOException {
	//
	
	driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
	
	String parentWindowId = driver.getWindowHandle();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult");
	
	Actions actions = new Actions(driver);
	actions.
	dragAndDrop(driver.findElement(By.id("drag1")), 
			driver.findElement(By.xpath("//div[@id = 'div1']"))).perform();
	
	driver.switchTo().defaultContent();
	
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, 
			new File("C:\\Users\\WIN 10.DESKTOP-VBBJ1UA\\git\\"
					+ "SeleniumAug23_git\\src\\test\\resources\\"
					+ "Screenshot\\DragDropDone.png"));
	
	
	
	
	
	}
}
