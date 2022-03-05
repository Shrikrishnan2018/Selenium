package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement txtUsername = driver.findElement(By.xpath("//input[@type='text']"));
	txtUsername.sendKeys("Krishna");
	WebElement txtPassword = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	txtPassword.sendKeys("123");
	WebElement btnLogin = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	btnLogin.click();

}}
