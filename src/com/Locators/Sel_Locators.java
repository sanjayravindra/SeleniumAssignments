package com.Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sel_Locators 
{

	static WebDriver driver;
	
public static void main(String[] args) 
{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay.ravindra\\eclipse-workspace\\SeleniumLocators\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Sel_Locators.funct();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sanjay.ravindra\\eclipse-workspace\\SeleniumLocators\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		Sel_Locators.funct();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sanjay.ravindra\\eclipse-workspace\\SeleniumLocators\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		Sel_Locators.funct();

}

public static void funct()
{	
	System.out.println("Browser opened");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

	WebElement radioButton = driver.findElement(By.cssSelector("input[value='radio2']"));
	radioButton.click();
	System.out.println(radioButton.getText());
	System.out.println("Radio button is selected");
	
	driver.findElement(By.id("autocomplete")).sendKeys("India");
	System.out.println("Country is selected");
	
driver.findElement(By.name("enter-name")).sendKeys("Sanjay");
System.out.println("Name is entered");

driver.findElement(By.xpath("//input[@class='inputs displayed-class']")).sendKeys("sanjay");
System.out.println("Display Name");
List<WebElement> tag = driver.findElements(By.tagName("a"));
for (WebElement list : tag) 
{
	System.out.println(list.getAttribute("href"));
}
System.out.println("List of url");
String lnk = driver.findElement(By.linkText("Home")).getText();
System.out.println(lnk);

 String pl = driver.findElement(By.partialLinkText("Limited offer - ")).getText();
System.out.println(pl);

driver.quit();
System.out.println("Browser closed");

}
}
