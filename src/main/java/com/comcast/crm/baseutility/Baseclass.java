package com.comcast.crm.baseutility;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.SiNoKa_In.erp.ProductRepository.CreateNewProduct;
import com.SiNoKa_In.erp.loginHomePageLogout.LoginPageLogout;
import com.comcast.crm.createcontactobjectrepository.HomePage;
import com.comcast.crm.fileutility.ExcelUtility;
import com.comcast.crm.fileutility.FileUtility;
import com.comcast.crm.generic.databaseutility.DatabaseUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.javautility.JavaUtility;
import com.comcast.crm.javautility.ObjectUtility;



public class Baseclass {

	public JavaUtility java = new JavaUtility();
	public WebDriverUtility web = new WebDriverUtility();
	public DatabaseUtility db = new DatabaseUtility();
	public ExcelUtility excel = new ExcelUtility();
	public FileUtility file = new FileUtility();
	public WebDriver driver;
	public LoginPageLogout loginpageogout;
	public HomePage home;
	public CreateNewProduct createnewproduct;

	@BeforeSuite
	public void configBS() throws Exception {
		System.out.println("Connect to db");
		db.getDBConnection();

	}

	@BeforeClass
	public void configBC() throws Exception {
		System.out.println("Connect to browser");
		String BROWSER = file.getDataFromProperties("browser");
		WebDriver rdriver=web.launchbrowser(BROWSER, driver);
	    driver=rdriver;
		

	}

	@BeforeMethod
	public void configBM() throws Exception {
		web.implicitwait(driver,Long.parseLong(file.getDataFromProperties("time")));
		String URL = file.getDataFromProperties("url");
		driver.get(URL);
		loginpageogout = new LoginPageLogout(driver);
		loginpageogout.getUsernameEdt().sendKeys(file.getDataFromProperties("user"),Keys.TAB+file.getDataFromProperties("pass"),Keys.ENTER);
		createnewproduct=new CreateNewProduct(ObjectUtility.getDriver());

	}
	
	@AfterMethod
	public void configAM()
	{
		loginpageogout.getuserprofileclick().click();
		loginpageogout.getlogout().click();
	
	}
	@Test
	public void test01() {
		
	}
	
	@AfterClass
	public void configAC()
	{
	System.out.println("Close the browser");
	driver.quit();
	}
	
	@AfterSuite
	public void configAS() throws Exception {
		System.out.println("close db connection");
		db.closeDbConnection();
	}

	
	


	
}
