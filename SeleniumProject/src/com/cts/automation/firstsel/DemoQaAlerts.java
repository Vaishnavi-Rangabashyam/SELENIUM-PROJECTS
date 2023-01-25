package com.cts.automation.firstsel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaAlerts {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement ClickBtn = driver.findElement(By.xpath("//button[@id=\'promtButton\']"));
		ClickBtn.click();
		Alert Name = driver.switchTo().alert();
		Name.sendKeys("Vaishnavi");
		Name.accept();
		WebElement PromptTxt = driver.findElement(By.xpath("//span[@id=\'promptResult\']"));
		System.out.println(PromptTxt.getText());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Screenshots = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshots,new File("C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\Screenshots\\alert.jpeg"));




	}

}
