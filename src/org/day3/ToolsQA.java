package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='subscriber-email']"));
		txtEmail.sendKeys("shrikrishnan2018@gmail.com");
		WebElement btnSubscribe = driver.findElement(By.xpath("//button[@class='subscribe__email--submit']"));
		btnSubscribe.click();
	}
}
