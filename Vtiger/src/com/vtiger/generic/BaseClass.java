package com.vtiger.generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements Iconstant {
	public static Properties con;
	public static FileInputStream fis;
	public static WebDriver driver;
	static String browser_name = "chrome";

	static {
		try {
			fis = new FileInputStream("./vtiger.properties");
			Properties con = new Properties();
			con.load(fis);
			browser_name = con.getProperty("browser");
			System.setProperty(CHROME_KEY, CHROME_VALUE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public static void before() throws Exception{

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(URL);

//		String path = IMG + IMG + ".png";
//		Pic.getScreenShot(driver, path);
	}

	public static void assets() throws Exception {
		driver.findElement(By.xpath("//table[@class='hdrTabBg']/descendant::td[24]")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		WebElement we =driver.findElement(By.xpath("//a[@name='Assets']"));
		we.click();
		//System.out.println(we.getText() +  "  assets is clicked and assets page is displaying ");
		
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

	}

	public static void search() throws Exception {
		driver.findElement(By.xpath("//table[@class='hdrTabBg']/descendant::td[24]")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@name='Assets']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		WebElement we1=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Search.gif']"));
		we1.click();
		System.out.println(we1.getText() +  "  search image is clicked  and searh page displaying ");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

	}

	public static void Calendar() throws Exception {
		driver.findElement(By.xpath("//table[@class='hdrTabBg']/descendant::td[24]")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@name='Assets']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

		WebElement we2=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Calendar.gif']"));
		we2.click();
		System.out.println(we2.getText() + "  calendar image is clicked and calendar popup displaying ");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

	}

	public static void clock() throws Exception {
		driver.findElement(By.xpath("//table[@class='hdrTabBg']/descendant::td[24]")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@name='Assets']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		WebElement we3=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Clock.gif']"));
		we3.click();
		System.out.println(we3.getText() + "  clock image is clicked and clock popup displaying ");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

	}

	public static void worldClock() throws Exception {
		driver.findElement(By.xpath("//table[@class='hdrTabBg']/descendant::td[24]")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@name='Assets']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		WebElement we4=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Calc.gif']"));
		we4.click();
		System.out.println(we4.getText() +" calculator image is clicked and  calculator popup is displaying ");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	}

	public static void chat() throws Exception {
		driver.findElement(By.xpath("//table[@class='hdrTabBg']/descendant::td[24]")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@name='Assets']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		WebElement we5=driver.findElement(By.xpath("//img[@src='themes/softed/images/tbarChat.gif']"));
		we5.click();
		System.out.println(we5.getText() + " chat image is clicked and chat page is  displaying ");
		
		
		//Thread.sleep(000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

	}

	public static void lastViewed() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@class='hdrTabBg']/descendant::td[24]")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@name='Assets']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		WebElement we6=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Tracker.gif']"));
		we6.click();
		System.out.println(we6.getText()  + "  lastviewed image is clicked and last viewed page is displaying ");
		
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

	}

	public static void importt() throws Exception {
		driver.findElement(By.xpath("//table[@class='hdrTabBg']/descendant::td[24]")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@name='Assets']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		WebElement we7=driver.findElement(By.xpath("//img[@src='themes/softed/images/tbarImport.gif']"));
		we7.click();
		System.out.println(we7.getText() + " import image is clicked and import page is displaying ");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

	}

	public static void export() throws Exception {
		driver.findElement(By.xpath("//table[@class='hdrTabBg']/descendant::td[24]")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@name='Assets']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		
		WebElement we8=driver.findElement(By.xpath("//img[@src='themes/softed/images/tbarExport.gif']"));
		we8.click();
		System.out.println(we8.getText()  + "  export image is clicked and export assets page is displaying ");
		
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

	}

	public static void findDuplicate() throws Exception {
		driver.findElement(By.xpath("//table[@class='hdrTabBg']/descendant::td[24]")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@name='Assets']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		WebElement we9=driver.findElement(By.xpath("//img[@src='themes/images/findduplicates.gif']"));
		we9.click();
		System.out.println(we9.getText() +"  finddupplicate image  is clicked and findduplicate page is displaying ");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

	}
	public static void settings() throws Exception
	{
		driver.findElement(By.xpath("//table[@class='hdrTabBg']/descendant::td[24]")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@name='Assets']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		WebElement we0=driver.findElement(By.xpath("//img[@src='themes/softed/images/settingsBox.png']"));
		we0.click();
		System.out.println(we0.getText()  + " setting image  is clicked  and setting page is displaying ");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

	}

	@AfterMethod
	public static void after() throws Exception {
		Thread.sleep(10000);
		driver.close();
	}

}
