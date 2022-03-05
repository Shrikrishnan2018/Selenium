package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement btnSignin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		btnSignin.click();
		WebElement btnRegister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		btnRegister.click();
		WebElement txtNumber = driver.findElement(By.xpath("//input[@class='col-xs-24']"));
		txtNumber.sendKeys("7395897564");
		WebElement btnContinue = driver.findElement(By.xpath("//button[@id='checkUser']"));
		btnContinue.click();
	}
}
