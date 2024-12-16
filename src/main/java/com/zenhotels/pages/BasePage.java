package com.zenhotels.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BasePage {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void openZenHotelsBrowser() {
		driver = new EdgeDriver();
		driver.get("https://www.zenhotels.com/?sid=5e89a9ba-422a-4e3d-bcf2-c1b71f4665da");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	@AfterSuite
	public void closeZenHotelsBrowser() {
		driver.quit();
	}

}
