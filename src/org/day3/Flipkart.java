package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement btnLogin = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		btnLogin.click();
		WebElement txtUsername = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtUsername.sendKeys("manoj");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtPassword.sendKeys("1234");
		WebElement btnlogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnlogin.click();
	}
}
