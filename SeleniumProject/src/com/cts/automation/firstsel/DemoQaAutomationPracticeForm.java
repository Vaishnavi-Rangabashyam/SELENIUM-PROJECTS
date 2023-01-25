package com.cts.automation.firstsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaAutomationPracticeForm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form/");
		WebElement FirstNameTxt = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FirstNameTxt.sendKeys("Vaishnavi");
		WebElement LastNameTxt = driver.findElement(By.xpath("//input[@id='lastName']"));
		LastNameTxt.sendKeys("Rangabashyam");
		WebElement EmailTxt = driver.findElement(By.xpath("//input[@id='userEmail']"));
		EmailTxt.sendKeys("098788jj@gmail.com");
		Thread.sleep(5000);
		WebElement GenderBtn = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
		GenderBtn.click();
		WebElement MobileNo = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		MobileNo.sendKeys("7648221233");
		Thread.sleep(5000);
		WebElement CheckBox1 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		CheckBox1.click();
		WebElement CheckBox2 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
		CheckBox2.click();
		WebElement CheckBox3 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
		CheckBox3.click();
		WebElement AddressTxt = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		AddressTxt.sendKeys("Salem(DT),Tamilnadu");
		WebElement SubjectTxt = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		SubjectTxt.sendKeys("Biodata");
		String CurrentUrl = driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(CurrentUrl);
		System.out.println(Title);
	}
	

}
