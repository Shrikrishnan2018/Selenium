package org.day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement txtAlertBox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		txtAlertBox.click();
		WebElement txt2 = driver
				.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		txt2.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Shrikrishnan");
		alert.accept();
		WebElement txt3 = driver.findElement(By.xpath("//p[@id='demo1']"));
		String text = txt3.getText();
		System.out.println(text);
		driver.quit();

	}

}
