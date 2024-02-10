package basicsSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingBasicAuth {
public static WebDriver driver;
	
	public static void main(String[] args ) throws InterruptedException, AWTException {
	//
	
	driver = new ChromeDriver();
	
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	//
	
	}
}
