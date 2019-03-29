package com.cg.addproduct.pagebean;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
public class AddProductPageBean {

	@FindBy(how = How.NAME, name = "prodid")
	private WebElement prodid;

	@FindBy(how = How.NAME, name = "prodname")
	private WebElement prodname;

	@FindBy(how = How.NAME, name = "p_price")
	private WebElement p_price;

	@FindBy(how = How.NAME, name = "address")
	private WebElement address;

	@FindBy(how = How.NAME, name = "city")
	private WebElement city;

	@FindBy(how = How.NAME, name = "email")
	private WebElement email;

	@FindBy(how = How.NAME, name = "pcat")
	private List<WebElement> pcat;

	@FindBy(how = How.NAME, name = "typ")
	private List<WebElement> typ;

	@FindBy(how=How.TAG_NAME,tagName="textarea")
	private WebElement desc;
	
	@FindBy(how = How.NAME, name = "submit")
	private WebElement submit;

	public String getProductId() {
		return prodid.getAttribute("value");
	}

	public void setProductId(String prodid) {
		this.prodid.clear();
		this.prodid.sendKeys(prodid);
	}

	public String getProductName() {
		return prodname.getAttribute("value");
	}

	public void setProductName(String prodname) {
		this.prodname.clear();
		this.prodname.sendKeys(prodname);
	}
	public String getProductCategory() {
		return prodname.getAttribute("value");
	}

	public void setProductCategory(String pcat) {
		for(WebElement elements:this.pcat) {
			if(elements.isSelected()==true)
			elements.click();
		}
		if(typ.equals("Electronics"))
			this.pcat.get(0).click();
		else
			this.pcat.get(1).click();
	}
	public String getProductPrice() {
		return p_price.getAttribute("value");
	}

	public void setProductPrice(String p_price) {
		this.p_price.clear();
		this.p_price.sendKeys(p_price);
	}
	public String getEmail() {
		return email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	public String getAddress() {
		return address.getAttribute("value");
	}

	public void setAddress(String address) {
		this.address.clear();
		this.address.sendKeys(address);
	}
	
	
	public String getCity() {
		return new Select(this.city).getFirstSelectedOption().getText();
	}

	public void setCity(String city) {
		Select select = new Select(this.city);
		select.selectByVisibleText(city);
	}

	public void clickSignUp() {
		submit.click();
	}

}
