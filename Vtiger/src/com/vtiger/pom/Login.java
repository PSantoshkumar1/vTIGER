package com.vtiger.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(name="user_name")
	private WebElement Username;
	@FindBy(name="user_password")
	private WebElement password;
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginBtn;
	
	
	WebDriver driver;
public Login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void inputUN(String text) {
		Username.sendKeys(text);
	}

	public void inputPWD(String text)  throws Exception{
		password.sendKeys(text);
	}

	public void loginClick() throws Exception{
		Thread.sleep(8000);
		loginBtn.click();
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
	}
	}
	


