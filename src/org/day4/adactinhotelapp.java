package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactinhotelapp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	WebElement txtLine = driver.findElement(By.xpath("//p[contains(text(),'Adactin Launches The Adactin Hotel App!')]"));
	String text = txtLine.getText();
	System.out.println(text);
	driver.quit();
}
}
