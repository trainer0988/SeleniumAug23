package basicsSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static WebDriver driver;
	


	public static void main(String[] args )  {
		driver = new ChromeDriver();

	driver.get("https://www.axisbank.com/");
	
	String parentWindowId = driver.getWindowHandle();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath(("//div[@id = 'nvpush_cross']"))).click();
	
	
	WebElement buss = driver.findElement(By.xpath("//a[text() = 'Business']"));
	
	
	Actions actions = new Actions(driver);
	actions.moveToElement(buss).perform();
	
	
	}
}
