package com.cts.automation.firstsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingUserNameFb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement UserNameTxt = driver.findElement(By.id("identifierId"));
		UserNameTxt.sendKeys("wetrggu@gmail.com");
		String CurrentUrl = driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(CurrentUrl);
		System.out.println(Title);
	}

}
