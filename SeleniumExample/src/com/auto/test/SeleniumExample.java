package com.auto.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/arunv/Desktop/Dev/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/CxfRs-Example/");
        WebElement element = driver.findElement(By.name("lastname"));
        element.sendKeys("Cheese!");
        Thread.sleep(5000);
        
        WebElement element2 = driver.findElement(By.id("sub"));
        element2.click();
        //System.out.println("Page title is: " + driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
	}

}
