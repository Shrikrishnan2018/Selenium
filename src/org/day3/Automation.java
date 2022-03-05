package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement txtEmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		txtEmail.sendKeys("Krishna");
		WebElement txtPhoneNumber = driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhoneNumber.sendKeys("123");
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		btnSubmit.click();

}
}