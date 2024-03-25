package org.insta;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethod {
	static WebDriver driver;
public static WebDriver browserlauch(String bname) {
	if (bname.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(bname.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else if(bname.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	return driver;

}
	public static void geturl(String a) {
	driver.get(a);
	}
	
	public static void SendKeys(WebElement e ,String a) {
		e.sendKeys(a);
	}
	 
	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	public static  String attribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;

	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void implicitywait(int a){
		driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
		
	}
	public static void moveToElement(WebElement b) {
		Actions a=new Actions(driver);
		a.moveToElement(b).perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
