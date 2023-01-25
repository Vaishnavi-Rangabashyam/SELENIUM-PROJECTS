package com.cts.automation.firstsel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class RowAndColumnInSpreadSheet {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();

		File testData = new File("C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\testData\\RnC.xls");
		FileInputStream fis = new FileInputStream (testData);
		HSSFWorkbook w = new HSSFWorkbook(fis);
		HSSFSheet sheet = w.getSheet("RnC");

		for (int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			HSSFRow eachRow = sheet.getRow(i);
			for (int j=0;j<eachRow.getPhysicalNumberOfCells();j++)
			{
				HSSFCell cell = eachRow.getCell(j);
				String eachValue = cell.toString();
				System.out.print(eachValue +" ");

			}
			System.out.println("");
		}
		

	}

}
