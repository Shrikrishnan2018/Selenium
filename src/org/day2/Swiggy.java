package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	driver.manage().window().maximize();
	WebElement txtLocation = driver.findElement(By.id("location"));
	txtLocation.sendKeys("Chennai");
}}
