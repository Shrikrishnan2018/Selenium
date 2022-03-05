package org.day2;

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
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Krishna");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("123");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnLogin.click();

	}

}
