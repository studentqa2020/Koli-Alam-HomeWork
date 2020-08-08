package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = BaseLogin.getDriver();

	
	
	  driver.get("https://www.zoopla.co.uk/"); Thread.sleep(2000);
		
		  System.out.println(driver.findElement( By.
		  xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']"
		  )).getText());
		  
		  driver.findElement(By.
		  xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']"
		  )).click();
		  
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  driver.manage().window().maximize(); driver.close();
		  
		  System.out.println("website open and close");
		 
	 
	}

}
