package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
	driver.manage().window().maximize();
	WebElement txtEmail = driver.findElement(By.xpath("(//input[@aria-required='true'])[1]"));
	txtEmail.sendKeys("Chennai");
}
}
