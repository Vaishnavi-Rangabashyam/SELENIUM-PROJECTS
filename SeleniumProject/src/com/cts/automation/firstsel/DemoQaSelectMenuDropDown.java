package com.cts.automation.firstsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQaSelectMenuDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement SelectOptClk = driver.findElement(By.xpath("(//div[contains(@class,' css-2b097c-container')])[1]"));
		SelectOptClk.click();
		Thread.sleep(5000);
		Actions acc = new Actions (driver);
		acc.moveToElement(SelectOptClk).sendKeys("root").build().perform();
		WebElement SelectOpnDdn = driver.findElement(By.xpath("//div[contains(text(),'A root option')]"));
		SelectOpnDdn.click();
		Thread.sleep(3000);
		WebElement SelectTitleTxt = driver.findElement(By.xpath("(//div[contains(@class,' css-2b097c-container')])[2]"));
		SelectTitleTxt.click();
		Thread.sleep(5000);
		acc.moveToElement(SelectTitleTxt).sendKeys("Mr").build().perform();
		WebElement SelectTitleDdn = driver.findElement(By.xpath("//div[contains(text(),'Mrs.')]"));
		SelectTitleDdn.click();

	}

}
