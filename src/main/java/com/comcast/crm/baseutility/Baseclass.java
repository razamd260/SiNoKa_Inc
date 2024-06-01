package com.comcast.crm.baseutility;




import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.comcast.crm.fileutility.ExcelUtility;
import com.comcast.crm.fileutility.FileUtility;
import com.comcast.crm.generic.databaseutility.DatabaseUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.javautility.JavaUtility;




public class Baseclass {

	public JavaUtility java = new JavaUtility();
	public WebDriverUtility web = new WebDriverUtility();
	public DatabaseUtility db = new DatabaseUtility();
	public ExcelUtility excel = new ExcelUtility();
	public FileUtility file = new FileUtility();
	public WebDriver driver;


	@BeforeSuite(groups= {"smoke","regression"})
	public void configBS() throws Exception {
		System.out.println("Connect to db");
		db.getDBConnection();

	}

	@BeforeClass(groups= {"smoke","regression"})
	public void configBC() throws Exception {
		System.out.println("Connect to browser");
		String BROWSER = file.getDataFromProperties("browser");
		WebDriver rdriver=web.launchbrowser(BROWSER, driver);
	    driver=rdriver;
		

	}

	@BeforeMethod(groups= {"smoke","regression"})
	public void configBM() throws Exception {
		web.implicitwait(driver,Long.parseLong(file.getDataFromProperties("time")));
		String URL = file.getDataFromProperties("url");
		driver.get(URL);
		 

	}
	
	@AfterMethod(groups= {"smoke","regression"})
	public void configAM()
	{
		
	
	}
	
	@AfterClass(groups= {"smoke","regression"})
	public void configAC()
	{
	System.out.println("Close the browser");
	driver.quit();
	}
	
	@AfterSuite(groups= {"smoke","regression"})
	public void configAS() throws Exception {
		System.out.println("close db connection");
		db.closeDbConnection();
	}

	
	


	
}
