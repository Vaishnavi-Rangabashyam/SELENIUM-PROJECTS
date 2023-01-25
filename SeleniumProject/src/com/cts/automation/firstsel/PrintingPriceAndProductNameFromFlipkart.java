package com.cts.automation.firstsel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingPriceAndProductNameFromFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement CloseBtn = driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2doB4z\']"));
		CloseBtn.click();
		WebElement SearchBoxTxt = driver.findElement(By.xpath("//input[@class=\'_3704LK\']"));
		SearchBoxTxt.sendKeys("iphone");
		WebElement SearchBtn = driver.findElement(By.xpath("//button[@class=\'L0Z3Pu\']"));
		SearchBtn.click();
		Thread.sleep(5000);
		List<WebElement> EachProductsName = driver.findElements(By.xpath("//a//div[contains(@class,\'_4rR01T\')]"));
		System.out.println("************Print The Size of ProductsName************");
		System.out.println(EachProductsName.size());
		for (WebElement ProductsName : EachProductsName)
		{
			System.out.println(ProductsName.getText());
		}
		Thread.sleep(5000);
		List<WebElement> EachProductsPrice = driver.findElements(By.xpath("//a//div[contains(@class,\'_30jeq3 _1_WHN1\')]"));
		System.out.println("************Print The Size of ProductsPrize************");
		System.out.println(EachProductsPrice.size());
		for (WebElement ProductsPrice : EachProductsName)
		{
			System.out.println(ProductsPrice.getText());
		}
		Thread.sleep(5000);
		String CurrentUrl = driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(CurrentUrl);
		System.out.println(Title);

	}

}
