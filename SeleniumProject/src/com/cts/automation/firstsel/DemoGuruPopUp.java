package com.cts.automation.firstsel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuruPopUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		Actions acc = new Actions(driver);
		Thread.sleep(3000);
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id=\'gdpr-consent-notice\']"));
		driver.switchTo().frame(frameElement);
		WebElement AcceptBtn = driver.findElement(By.xpath("//button[@id='save']"));
		Thread.sleep(3000);
		acc.moveToElement(AcceptBtn).click(AcceptBtn).build().perform();
		WebElement ClickBtn = driver.findElement(By.xpath("//a[@href='../articles_popup.php']"));
		ClickBtn.click();
		Thread.sleep(3000);
		Set<String> allTabs = driver.getWindowHandles();
		List<String> allTabsList = new ArrayList<>(allTabs);
		driver.switchTo().window(allTabsList.get(1));
		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot)driver; 
		File Screenshots = ts.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(Screenshots,new File("C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\Screenshots\\alert0.jpeg"));
		WebElement EmailTxt  = driver.findElement(By.xpath("//input[contains(@name,'emailid')]"));
		EmailTxt.click();
		EmailTxt.sendKeys("deeg@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().window(allTabsList.get(0));
		WebElement FirstheaderTxt  = driver.findElement(By.xpath("//h2[contains(@class,'barone')]"));
		System.out.println(FirstheaderTxt.getText());
		System.out.println(ClickBtn.getText());


	}

}
