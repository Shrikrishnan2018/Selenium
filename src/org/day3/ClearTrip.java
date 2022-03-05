package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		WebElement txtFrom = driver.findElement(By.xpath("//input[@id='from_station']"));
		txtFrom.sendKeys("chennai");
		WebElement txtTo = driver.findElement(By.xpath("//input[@id='to_station']"));
		txtTo.sendKeys("villupuram");
		WebElement btnSignUp = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btnSignUp.click();
}}
