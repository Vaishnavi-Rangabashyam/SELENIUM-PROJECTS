package com.cts.automation.firstsel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookValuesInSpreadSheet {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement CookiesBtn = driver.findElement(By.xpath("//button[@data-cookiebanner=\'accept_button\']"));
		CookiesBtn.click();
		File testData = new File("C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\testData\\fb.xls");
		FileInputStream fis = new FileInputStream (testData);
		HSSFWorkbook w = new HSSFWorkbook(fis);
		HSSFSheet sheet = w.getSheet("info");
		HSSFRow row = sheet.getRow(0);
		HSSFCell cell1 = row.getCell(0);
		HSSFCell cell2 = row.getCell(1);
		WebElement UserNameTxt = driver.findElement(By.xpath("//input[@autocomplete='username']"));
		UserNameTxt.sendKeys(cell1.getStringCellValue());
		Thread.sleep(3000);
		WebElement PasswordTxt = driver.findElement(By.xpath("//input[@type=\'password\']"));
		String pass_Str = String.valueOf(cell2.getNumericCellValue());
		PasswordTxt.sendKeys(pass_Str);

	}
}
