package com.cts.automation.firstsel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQaSelectMenu {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement OldStyleDdn = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select S = new Select (OldStyleDdn);
		S.selectByIndex(3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		WebElement carsDdn = driver.findElement(By.xpath("//select[@name=\'cars\']"));
		Select S1 = new Select (carsDdn);
		S1.selectByVisibleText("Saab");
		S1.selectByVisibleText("Opel");
		S1.selectByVisibleText("Audi");

		

	}

}
