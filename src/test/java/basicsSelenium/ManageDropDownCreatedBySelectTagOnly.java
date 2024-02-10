package basicsSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageDropDownCreatedBySelectTagOnly {
	public static WebDriver driver;
	
	public static void main(String[] args ) {
	//
	
	driver = new ChromeDriver();
	
	driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
	System.out.println("tiitle of the page is : " + driver.getTitle());
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	driver.manage().window().maximize();
	
	Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	WebElement country = driver.findElement(By.id("Form_getForm_Country"));
	
	Select select = new Select(country);
	select.selectByVisibleText("India");
	
	}
}
