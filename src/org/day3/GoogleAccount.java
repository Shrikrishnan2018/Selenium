package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccount {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		WebElement txtFirstName = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]"));
		txtFirstName.sendKeys("shri");
		WebElement txtLastName = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[2]"));
		txtLastName.sendKeys("Krishnan");
		WebElement txtUsername = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[3]"));
		txtUsername.sendKeys("shrikrishnan2018@gmail.com");
		WebElement txtPassword = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[4]"));
		txtPassword.sendKeys("password");
		WebElement txtConfirmPassword = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[5]"));
		txtConfirmPassword.sendKeys("password");
		WebElement btnNext = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
		btnNext.click();
	}
}
