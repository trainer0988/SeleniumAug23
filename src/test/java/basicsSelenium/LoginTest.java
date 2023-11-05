package basicsSelenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	
	public static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("tiitle of the page is : " + driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		/*
		 * Wait fwait = new FluentWait(driver). withTimeout(Duration.ofSeconds(10)).
		 * pollingEvery(Duration.ofSeconds(5)). ignoring(NoSuchElementException.class);
		 * 
		 * fwait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")))
		 * ;
		 */
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	
		
		/*JavascriptExecutor javas = 	(JavascriptExecutor)driver;
		javas.executeScript("");*/
		
		/* Locators 
		 * id -> defaukt
		 * name -> dafult
		 * class name -> default
		 * css
		 * xpath
		 * link text -> def
		 * partial link text -> def
		 * tagname -> def
		 * 1
		 */
		 //tagname[@attritbute = 'value']
		//tagname[text() = 'value']
		
		driver.findElement(By.xpath("//button[text() = ' Login ']")).click();
		
		driver.findElement(By.xpath("//span[text() = 'PIM']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Add Employee']")).click();
		
		driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("Ashutosh");
		driver.findElement(By.xpath("//input[@name = 'middleName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name = 'lastName']")).sendKeys("Singh");
		driver.findElement(By.xpath("((//div[@class = 'oxd-form-row'])[1]//input)[4]")).sendKeys("123");
		driver.findElement(By.xpath("//p[text() = 'Create Login Details']/parent::div/div/label/span")).click();
		
		  driver.findElement(By.xpath("//label[text() ='Username' ]//parent::div//parent::div/div[2]/input")).sendKeys("Ashutosh"+Math.random());
		  driver.findElement(By.xpath("(//input[@type = 'password'])[1]")).sendKeys("Ashutosh123");
		  driver.findElement(By.xpath("(//input[@type = 'password'])[2]")).sendKeys("Ashutosh123");
		  driver.findElement(By.xpath("//button[text() = ' Save ']")).click();
		  
		  Thread.sleep(10000L);
		  driver.findElement(By.xpath("//label[text() = 'Nationality']/parent::div/following-sibling::div")).click();
		  
		  
			/*
			 * FileWriter fw=new FileWriter(
			 * "D://workspace//SeleniumAug23//selelenumproject//src//test//resources//source.txt"
			 * ); fw.write(driver.getPageSource()); fw.close();
			 */
          Thread.sleep(2000L);
  
          
    
        selectNatianality("Indian");
       selectValueForMaritalStatus("Single");
       
       driver.findElement(By.xpath("(//input[@placeholder = 'yyyy-mm-dd'])[2]")).
       sendKeys("2023-11-08");
       
       
       
     
       
          

         
		
	}
	
	public static void selectNatianality(String nationality_value)
	{
	
   WebElement nationality =  driver.findElement(By.xpath("//label[text() = 'Nationality']/ancestor::div[2]"));
       
       List<WebElement> l =   nationality.findElements(By.tagName("div"));
       
       System.out.println(l.size());
       
       for(WebElement wl : l)
       {
    	   System.out.println(wl.getText());
    	   if(wl.getText().equals(nationality_value))
    	   {
    		   wl.click();
    		   break;
    	   }
       }
	}
	
	
	public static void selectValueForMaritalStatus(String ms_value)
	{
	driver.findElement(By.xpath("//label[text() = 'Marital Status']/parent::div/following-sibling::div")).click();
	  
    WebElement ms =  driver.findElement(By.xpath("//label[text() = 'Marital Status']/ancestor::div[2]"));
    
    List<WebElement> l2 =   ms.findElements(By.tagName("div"));
    
    System.out.println(l2.size());
    
    for(WebElement wl : l2)
    {
 	   System.out.println(wl.getText());
 	   if(wl.getText().equals(ms_value))
 	   {
 		   wl.click();
 		   break;
 	   }
    }
	}

}
