package com.cts.automation.firstsel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationDemoSiteFrames {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[contains(@href,'#Multiple')]")).click();
		Thread.sleep(3000);
		WebElement frame1 = driver.findElement(By.xpath("(//iframe[contains(@style,'float: left;height:')])[2]"));
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);
		WebElement frame2 = driver.findElement(By.xpath("(//iframe[contains(@src,'SingleFrame.html')])[1]"));
		driver.switchTo().frame(frame2);
		Thread.sleep(3000);
		WebElement TextBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		TextBox.click();
		TextBox.sendKeys("Multi  frame");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Screenshots = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshots,new File("C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\Screenshots\\MultipleFrame0.jpeg"));
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'#Single')]")).click();
		
		WebElement singleFrame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(singleFrame1);
		Thread.sleep(3000);
		WebElement TextBox2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		TextBox2.click();
		TextBox2.sendKeys("Single frame");
		
		Screenshots = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshots,new File("C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\Screenshots\\MultipleFrame1.jpeg"));

	}

}
