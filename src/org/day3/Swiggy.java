package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement txtSignUp = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		txtSignUp.click();
		WebElement txtNumber= driver.findElement(By.xpath("(//input[@class='_381fS'])[1]"));
		txtNumber.sendKeys("7395897564");
		WebElement txtName = driver.findElement(By.xpath("(//input[@class='_381fS'])[2]"));
		txtName.sendKeys("Shrikrishnan");
		WebElement txtEmail = driver.findElement(By.xpath("(//input[@class='_381fS'])[3]"));
		txtEmail.sendKeys("Shrikrishnan2018@gmail.com");
		WebElement txtPassword = driver.findElement(By.xpath("(//input[@class='_381fS'])[4]"));
		txtPassword.sendKeys("password");
		WebElement btnContinue = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnContinue.click();

}}
