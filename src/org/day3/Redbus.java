package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement btnDownArrow = driver.findElement(By.xpath("//div[@id='signin-block']"));
		btnDownArrow.click();
		WebElement btnSignUp = driver.findElement(By.xpath("//li[@id='signInLink']"));
		btnSignUp.click();
		WebElement txtNumber = driver.findElement(By.className("mobileInputContainer clearfix contact-box"));
		txtNumber.sendKeys("7395897564");
		WebElement btnOtp = driver.findElement(By.className("social FC DIB"));
		btnOtp.click();
}}
