package com.qa.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {

@Test
public static void main(String[] args) throws InterruptedException //Test method
{
        
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("http://18.191.164.5:8082/");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.linkText("About Us")).click();
		
		 }
}

