package com.SiNoKa_In.erp.Product;

import org.testng.annotations.Test;

import com.comcast.crm.baseutility.Baseclass;

public class ProductModule extends Baseclass{
	
	@Test
	public void createnewproductTest() {
		String Product_ref=excel.readDataFromExcel("Sheet1", 4, 1);
		String label=excel.readDataFromExcel("Sheet1", 4, 2);
		createnewproduct.getproduct_serviceModule().click();
		createnewproduct.getnewproduct().click();
		createnewproduct.getProduct_ref().sendKeys(Product_ref+java.getRandomNumber());
		createnewproduct.getlabel().sendKeys(label+java.getRandomNumber());
		createnewproduct.getcreateproductsaveButton().click();
		
	}
	
	@Test
	public void test01() {
		System.out.println("Test01 New Please Check");
	}

}
