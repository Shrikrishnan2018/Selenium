package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement txtLine = driver.findElement(By.xpath("//a[contains(text(),'Use')]"));
	String text = txtLine.getText();
	System.out.println(text);
	driver.quit();
}
}