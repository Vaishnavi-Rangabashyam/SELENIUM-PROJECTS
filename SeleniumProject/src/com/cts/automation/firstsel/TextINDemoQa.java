package com.cts.automation.firstsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextINDemoQa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form/");
		WebElement HeaderTxt = driver.findElement(By.xpath("//div[@class=\"main-header\"]"));
		System.out.println(HeaderTxt.getText());
		WebElement StuTxt = driver.findElement(By.xpath("//h5[contains(text(),'Student Registration Form')]"));
		System.out.println(StuTxt.getText());
		WebElement Lab1 = driver.findElement(By.xpath("(//label[contains(@class,'form-label')])[1]"));
		System.out.println(Lab1.getText());
		WebElement Lab2 = driver.findElement(By.xpath("//label[contains(@id,'userEmail-label')]"));
		System.out.println(Lab2.getText());
		WebElement Lab3 = driver.findElement(By.xpath("//div[contains(text(),'Gender')]"));
		System.out.println(Lab3.getText());
		WebElement Lab4 = driver.findElement(By.xpath("(//label[@class=\"form-label\"])[3]"));
		System.out.println(Lab4.getText());
		WebElement Lab5 = driver.findElement(By.xpath("//label[contains(text(),'Date of Birth')]"));
		System.out.println(Lab5.getText());
		WebElement Lab6 = driver.findElement(By.xpath("(//label[contains(@id,'subjects-label')])[3]"));
		System.out.println(Lab6.getText());
		WebElement Lab7 = driver.findElement(By.xpath("(//label[contains(@id,'subjects-label')])[2]"));
		System.out.println(Lab7.getText());
		WebElement Lab8 = driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-1')]"));
		System.out.println(Lab8.getText());
		WebElement Lab9 = driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-2')]"));
		System.out.println(Lab9.getText());
		WebElement Lab10 = driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-3')]"));
		System.out.println(Lab10.getText());
		WebElement Lab11 = driver.findElement(By.xpath("//label[contains(@id,'subjects-label')]"));
		System.out.println(Lab11.getText());
		WebElement Lab12 = driver.findElement(By.xpath("//label[contains(@class,'form-file-label')]"));
		System.out.println(Lab12.getText());
		WebElement Lab13 = driver.findElement(By.xpath("//input[contains(@id,'uploadPicture')]"));
		System.out.println(Lab13.getText());
		WebElement Lab14 = driver.findElement(By.xpath("//label[contains(@id,'currentAddress-label')]"));
		System.out.println(Lab14.getText());
		WebElement Lab15 = driver.findElement(By.xpath("//label[contains(@id,'stateCity-label')]"));
		System.out.println(Lab15.getText());



		
		
	}

}
