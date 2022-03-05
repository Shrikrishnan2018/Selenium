package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensWebsite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\JAVA\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement txtOverview= driver.findElement(By.xpath("//a[@id='overview-tab']"));
		txtOverview.click();
		//Thread.sleep(3000);
		WebElement txtPara = driver.findElement(By.xpath("(//p[contains(text(),'make')])[1]"));
		String para = txtPara.getText();
		System.out.println(para);
		driver.quit();
		
	}
}
