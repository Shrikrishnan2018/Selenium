package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("chennai");
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("pondy");
		WebElement txtDate = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		txtDate.sendKeys("05-05-2022");
		WebElement btnSearch = driver.findElement(By.xpath("//button[@id='search_btn']"));
		btnSearch.click();
		



	}

}
