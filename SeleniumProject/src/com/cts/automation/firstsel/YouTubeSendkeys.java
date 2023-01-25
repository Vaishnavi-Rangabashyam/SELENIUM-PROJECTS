package com.cts.automation.firstsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeSendkeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		//WebElement CookiesBtn = driver.findElement(By.xpath("//div[@class=\"yt-spec-touch-feedback-shape__fill\"]"));
		//CookiesBtn.click();
		Thread.sleep(5000);
		WebElement SearchTxt = driver.findElement(By.xpath("//input[@id=\"search\"]"));
		SearchTxt.sendKeys("russian war news");
		WebElement SearchBtn = driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]"));
		SearchBtn.click();
		String CurrentUrl = driver .getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(CurrentUrl);
		System.out.println(Title);
	}

}
