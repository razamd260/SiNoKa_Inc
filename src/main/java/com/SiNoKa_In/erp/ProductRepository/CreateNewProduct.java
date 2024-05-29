package com.SiNoKa_In.erp.ProductRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProduct {

	public CreateNewProduct(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Products | Services']")
    private WebElement product_serviceModule;

  
    
	public WebElement getproduct_serviceModule() {
		return product_serviceModule;
	}

	@FindBy(xpath="//a[text()='New product']")
	private WebElement newproduct;
	
	@FindBy(id="ref")
	private WebElement Product_ref;
	
	@FindBy(xpath="//input[@name='label']")
	private WebElement label;

	@FindBy(name="add")
	private WebElement createproductsaveButton;
	
	public WebElement getcreateproductsaveButton() {
		return createproductsaveButton;
	}
	
    public WebElement getnewproduct() {
    	return newproduct;
    }

    public WebElement getProduct_ref() {
    	return Product_ref;
    }
    public WebElement getlabel() {
    	return label;
    }
  
	
}
