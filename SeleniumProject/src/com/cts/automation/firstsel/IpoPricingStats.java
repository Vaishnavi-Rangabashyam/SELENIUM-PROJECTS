package com.cts.automation.firstsel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IpoPricingStats {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nyse.com/ipo-center/ipo-pricing-stats");
		Thread.sleep(3000);
		WebElement CookiesBtn = driver.findElement(By.xpath("//button[contains(@id,'onetrust-accept-btn-handler')]"));
		CookiesBtn.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'IPO Pricing Stats')]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(4000);
		List<WebElement> allRows = driver.findElements(By.xpath("//tbody//tr//td"));
		for (int i=0;i<allRows.size();i++)
		{
			String xpathOfEachRowColumnCnt = "(//tbody//tr)["+(i+1)+"]//td";
			List<WebElement> eachRowColumnElements = driver.findElements(By.xpath(xpathOfEachRowColumnCnt));

			for (int j=0;j<eachRowColumnElements.size();j++)
			{
				String eachCellXPath ="(//tbody//tr)["+(i+1)+"]//td["+(j+1)+"]";
				System.out.print(driver.findElement(By.xpath(eachCellXPath)).getText() + "  " );
				
			}
			System.out.println();
		}

	}

}
