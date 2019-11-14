package com.vtiger.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.vtiger.generic.Iconstant;
import com.vtiger.generic.Pic;


public class HomePage implements Iconstant{
	
	public HomePage(WebDriver driver) {
		this.HomePage(driver);
		}

	public void HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyHomePageIsDisplayed(WebDriver driver, long ETO, String title) throws Exception {
		try {
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("HomePage is Displayed", true);
			//Xl.setStatus(XLPATH, SHEET, 2, 3, "Pass");

		} catch (Exception e) {
			Reporter.log("Home Page is not displayed", true);
			try {
				Pic.getScreenShot(driver, title);
				//Xl.setStatus(XLPATH, SHEET, 2, 3, "Fail");

			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();

		}
	}
}

