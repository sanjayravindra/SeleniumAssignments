package com.Assignment2;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay.ravindra\\eclipse-workspace\\SeleniumLocators\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.className("nav-input")).click();
	 List<WebElement> iphone = driver.findElements(By.xpath("//span[contains(text(), 'Apple iPhone')]"));
for (WebElement list : iphone) 
{
System.out.println(list.getText());	
}

System.out.println("click");

driver.findElement(By.xpath("(//span[@class = 'a-size-medium a-color-base a-text-normal'])[1]")).click();

System.out.println("new tab");


for (String handle1 : driver.getWindowHandles()) 
{

    driver.switchTo().window(handle1);
 }

  System.out.println("switch");
 WebElement product = driver.findElement(By.id("productTitle"));
 System.out.println(product.getText());
 
 WebElement price = driver.findElement(By.id("priceblock_ourprice"));
 System.out.println(price.getText());
 
 WebElement details = driver.findElement(By.id("feature-bullets"));
 System.out.println(details.getText());
 
 

driver.quit();
	}

}
