package com.cts.automation.firstsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassSendkeysInFb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(8000);
		//WebElement CookiesBtn = driver.findElement(By.xpath("//button=[@type=\"submit\"]"));
		//CookiesBtn.click();
		WebElement UserNameTxt = driver.findElement(By.xpath("//input[@autocomplete=\"username\"]"));
		UserNameTxt.sendKeys("wetrggu@gmail.com");
		WebElement PasswordTxt =driver.findElement(By.xpath("//input[@autocomplete=\"current-password\"]")); 
		PasswordTxt.sendKeys("098768jj");
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		LoginBtn.click();
		String CurrentUrl =driver.getCurrentUrl(); 
		String Title = driver.getTitle();
		System.out.println(CurrentUrl); 
		System.out.println(Title);
	}

}
