package com.cts.automation.firstsel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IpoPricingStatsInSpreedSheet {
	public static void main(String[] args) throws InterruptedException, IOException {
		File testData = new File("C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\testData\\ipo.xls");
		FileOutputStream fos = new FileOutputStream (testData);
		HSSFWorkbook w = new HSSFWorkbook();
		HSSFSheet sheet = w.createSheet("IPO");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nyse.com/ipo-center/ipo-pricing-stats");
		Thread.sleep(3000);
		WebElement CookiesBtn = driver.findElement(By.xpath("//button[contains(@id,'onetrust-accept-btn-handler')]"));
		CookiesBtn.click();
		Thread.sleep(2000);
		List<WebElement> allRows = driver.findElements(By.xpath("//tbody//tr"));
		for (int i=1;i<allRows.size();i++)
		{
			List<WebElement> allColumns = driver.findElements(By.xpath("(//tbody//tr)["+(i)+"]//td"));
			HSSFRow eachRow = sheet.createRow(i);
			for (int j=1;j<allColumns.size();j++)
			{
				HSSFCell cell = eachRow.createCell(j);
				String eachValue = driver.findElement(By.xpath("(//tbody//tr)["+(i)+"]//td["+(j)+"]")).getText();
				cell.setCellValue(eachValue);

			}
			System.out.println();
		}
		w.write(fos);

	}

}
