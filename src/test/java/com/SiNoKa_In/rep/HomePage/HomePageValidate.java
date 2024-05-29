package com.SiNoKa_In.rep.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.baseutility.Baseclass;

public class HomePageValidate extends Baseclass{
	
	@Test
	public void homepagedisplayedtestTest() {
		String actualhomepage=loginpageogout.gethomepage().getText();
		System.out.println(actualhomepage);
		String expectedhomepage=file.getDataFromProperties("homepage");
		Assert.assertEquals(actualhomepage, expectedhomepage);
	}

}
