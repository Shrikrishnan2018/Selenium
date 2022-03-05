package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensResume {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement btnModelResume = driver.findElement(By.xpath("//div[@id='heading201']"));
		btnModelResume.click();
		WebElement btnResume1 = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		btnResume1.click();
	}
}
