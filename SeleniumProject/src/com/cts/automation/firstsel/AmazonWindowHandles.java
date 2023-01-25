package com.cts.automation.firstsel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Actions acc = new Actions (driver);
		Thread.sleep(3000);
		WebElement SearchBox = driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]"));
		acc.moveToElement(SearchBox).click(SearchBox).build().perform();
		SearchBox.sendKeys("iphone");
		WebElement SearchBtn = driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]"));
		SearchBtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)","");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")).click();
		Set<String> allTabs = driver.getWindowHandles();
		List<String> allTabsList = new ArrayList<>(allTabs);
		driver.switchTo().window(allTabsList.get(1));
		WebElement FirstProductTitle = driver.findElement(By.xpath("//span[contains(@id,'productTitle')]"));
		System.out.println(FirstProductTitle.getText());
		Thread.sleep(5000);
		WebElement FirstProductPrice = driver.findElement(By.xpath("//span[@class=\'a-price aok-align-center reinventPricePriceToPayMargin priceToPay\']"));
		System.out.println(FirstProductPrice.getText());
		Thread.sleep(3000);
		driver.switchTo().window(allTabsList.get(0));
		driver.findElement(By.xpath("(//a[@Class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[2]")).click();
		Thread.sleep(5000);
		Set<String> allTabs1 = driver.getWindowHandles();
		List<String> allTabsList1 = new ArrayList<>(allTabs1);
		driver.switchTo().window(allTabsList1.get(2));
		WebElement SecondProductTitle = driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']"));
		System.out.println(SecondProductTitle.getText());
		Thread.sleep(3000);
		WebElement SecondProductPrice = driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']"));
		System.out.println(SecondProductPrice.getText());
		
		
	}

}
