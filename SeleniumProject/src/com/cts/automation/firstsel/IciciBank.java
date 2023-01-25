package com.cts.automation.firstsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish_at6vq7\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/creatgoal");
		driver.findElement(By.xpath("//a[@href=\'https://infinity.icicibank.com/corp"
				+ "/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__"
				+ "=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_ga"
				+ "=2.207524763.967467733.1663597386-1965830906.1653893150&_gl=1*1xgly8c*_ga*MTk2NTgzMDkwNi4xNjUzODkzMTUw*_"
				+ "ga_SKB78GHTFV*MTY2MzkwOTc4Ny4xMDUuMS4xNjYzOTE4Njc3LjYwLjAuMA..\']"))
		.click();
		/*
		 * Thread.sleep(8000); WebElement UserIdTxt =
		 * driver.findElement(By.xpath("//input[@title=\'User Id\']"));
		 * UserIdTxt.sendKeys("wwett@gmail.com"); Thread.sleep(3000); WebElement
		 * PasswordTxt =
		 * driver.findElement(By.xpath("//input[@name=\'AuthenticationFG.ACCESS_CODE\']"
		 * )); PasswordTxt.sendKeys("fhjkvn");
		 */
		String CurrentUrl = driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(CurrentUrl);
		System.out.println(Title);
		
	}

}
