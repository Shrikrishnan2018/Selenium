package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	driver.manage().window().maximize();
	WebElement txtUserId = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	txtUserId.sendKeys("7589");
}
}