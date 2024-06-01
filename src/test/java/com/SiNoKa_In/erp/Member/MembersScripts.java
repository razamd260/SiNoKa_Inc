package com.SiNoKa_In.erp.Member;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.baseutility.Baseclass;

public class MembersScripts extends Baseclass {

	@Test(enabled=false)
	public void createnewproductTest() {
		String getnatureofnumber=excel.readDataFromExcel("Sheet1", 4, 1);
		String label=excel.readDataFromExcel("Sheet1", 4, 2);
		
//		createnewmember.getmemberpage().click();
//		createnewmember.getnewmember().click();
//		createnewmember.gettypemember().click();
//		createnewmember.getOwner().click();
//		createnewmember.getnatureofnumber().sendKeys();
//		createnewmember.getlastname().sendKeys();
		
		

		
	}
	
	@Test(groups="regression")
	public void ATest() {
		String url=System.getProperty("url"); 
		String browser=System.getProperty("browser");
		String env=System.getProperty("env");
		System.out.println("Test01 Regression Testing Of Member Module : "+url +"  : "+browser + " : "+env);
	}
	
	@Test(groups="smoke")
	public void BTest() {
		String user=System.getProperty("user");
		System.out.println("Test01 smoke Testing Of Member Module : "+user);
	}
	
	
}
