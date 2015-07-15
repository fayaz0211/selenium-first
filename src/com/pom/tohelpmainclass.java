package com.pom;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tohelpmainclass {
	private static WebDriver driver; 

	public static void Choose_Browser(String URL) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public static void Enter_Text(String Xpath, String text){
		driver.findElement(By.xpath(Xpath)).sendKeys(text);		
	}

}
