package com.cts.automation.firstsel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolsRowsTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		WebElement CookiesBtn = driver.findElement(By.xpath("//div[@id='accept-choices']"));
		CookiesBtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(4000);
		List<WebElement> allElements = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
		System.out.println(allElements.size());
		int nRows = allElements.size()/3;
		for (int i=3;i<=nRows+1;i=i+2)
		{
			String eachColXPath1 ="(//table[@id='customers']//tbody//tr)["+(i)+"]//td[1]";
			String eachColXPath2 ="(//table[@id='customers']//tbody//tr)["+(i)+"]//td[3]";
			System.out.print(driver.findElement(By.xpath(eachColXPath1)).getText() + " ");
			System.out.println(driver.findElement(By.xpath(eachColXPath2)).getText() + " ");
		}

	}

}
