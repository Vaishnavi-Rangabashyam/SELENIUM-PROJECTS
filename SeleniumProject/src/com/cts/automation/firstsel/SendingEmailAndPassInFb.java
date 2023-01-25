package com.cts.automation.firstsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingEmailAndPassInFb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		Thread.sleep(5000);
		Thread.sleep(3000);
		WebElement CancelTxt = driver.findElement(By.xpath("//a[@role=\'button\']"));
		CancelTxt.click();
		WebElement UserNameTxt = driver.findElement(By.name("email"));
		UserNameTxt.sendKeys("wetrggu@gmail.com");
		WebElement PasswordTxt = driver.findElement(By.name("pass"));
		PasswordTxt.sendKeys("098768jj");
		Thread.sleep(3000);
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		LoginBtn.click();
		Thread.sleep(3000);
		WebElement FindYourAccountTxt = driver.findElement(By.xpath("//input[@id=\'email\']"));
		FindYourAccountTxt.sendKeys("9876543210");
		String CurrentUrl = driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(CurrentUrl);
		System.out.println(Title);
		
	}

}
