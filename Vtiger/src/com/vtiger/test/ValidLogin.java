package com.vtiger.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.generic.BaseClass;
import com.vtiger.generic.Xl;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.Login;



public class ValidLogin extends BaseClass{
	@Test
	public static void validLogin() throws Exception  {
		String Username= Xl.getData(XLPATH, SHEET, 1, 0);
		String password = Xl.getData(XLPATH, SHEET, 1, 1);
		String title = Xl.getData(XLPATH, SHEET, 1, 2);
		
		
		Login l = new Login(driver);
		
		l.inputUN(Username);
		l.inputPWD(password);
		l.loginClick();
		
		BaseClass b=new BaseClass();
		b.assets();
		l.inputUN(Username);
		l.inputPWD(password);
		l.loginClick();
		b.search();
		l.inputUN(Username);
		l.inputPWD(password);
		l.loginClick();
		b.Calendar();
		l.inputUN(Username);
		l.inputPWD(password);
		l.loginClick();
		b.clock();
		l.inputUN(Username);
		l.inputPWD(password);
		l.loginClick();
		b.worldClock();
		l.inputUN(Username);
		l.inputPWD(password);
		l.loginClick();
		b.chat();
		String parent=driver.getWindowHandle();
		Set<String> subtab=driver.getWindowHandles();
		subtab.remove(parent);
		for(String name :subtab)
		{
			driver.switchTo().window(name);
		}
		driver.close();
		driver.switchTo().window(parent);
		l.inputUN(Username);
		l.inputPWD(password);
		l.loginClick();
		b.lastViewed();
		l.inputUN(Username);
		l.inputPWD(password);
		l.loginClick();
		b.importt();
		l.inputUN(Username);
		l.inputPWD(password);
		l.loginClick();
		b.export();
		l.inputUN(Username);
		l.inputPWD(password);
		l.loginClick();
		b.findDuplicate();
		l.inputUN(Username);
		l.inputPWD(password);
		l.loginClick();
		b.settings();

}
}