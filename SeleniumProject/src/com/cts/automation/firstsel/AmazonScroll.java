package com.cts.automation.firstsel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonScroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.nl/?language=en_GB/");
		WebElement CookiesBtn = driver.findElement(By.xpath("//input[@name=\'accept\']"));
		CookiesBtn.click();
		Actions acc = new Actions(driver);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		Thread.sleep(2000);
		WebElement ImagView = driver.findElement(By.xpath("//img[contains(@alt,\'Home Improvement\')]"));
		acc.moveToElement(ImagView).perform();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(3000,0)", "");
		String CurrentUrl = driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(CurrentUrl);
		System.out.println(Title);

	}

}
