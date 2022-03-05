package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement txtNumber = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		txtNumber.sendKeys("7395897564");
		WebElement btnContinue = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btnContinue.click();
}}