package basicsSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AxisBankLoan {
public static WebDriver driver;
	
	public static void main(String[] args ) throws InterruptedException {
	//
	
	driver = new ChromeDriver();
	
	driver.get("https://www.axisbank.com/");
	
	String parentWindowId = driver.getWindowHandle();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath(("//div[@id = 'nvpush_cross']"))).click();
	
	driver.findElement(By.xpath("//span[contains(text() , 'Apply Personal Loan')]")).click();
	
	Set<String> windows = driver.getWindowHandles();
	
	for(String window: windows)
	{
		if(!(window.equals(parentWindowId)))
		{
			driver.switchTo().window(window);
		}
		
	}
	
	driver.findElement(By.xpath("//a[text() = 'I am not an Axis Bank Customer ']")).click();
	
	
	
	Select select = new Select(driver.findElement(By.id(("incomeRange"))));
	select.selectByVisibleText("40k to 50k");
	
	
	driver.findElement(By.id("incomeRangeSel")).click();
	
	driver.switchTo().window(parentWindowId);
	
	Thread.sleep(02000L);
	
	driver.findElement(By.xpath("//div[contains(text() , 'Login')]")).click();
	
	}
}
