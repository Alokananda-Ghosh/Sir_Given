package com.cg.addproduct.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.addproduct.pagebean.AddProductPageBean;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddProductStepDefinition {
	private WebDriver driver;
	private AddProductPageBean pageBean;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver",
				"driver/chromedriver.exe" );
		driver=new ChromeDriver();	
	}
	
	@Given("^User is on the Add-Product Page onBrowser$")
	public void user_is_on_the_Add_Product_Page_onBrowser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get("C:\\Users\\ALOKGHOS\\Desktop\\Sir_Given\\AddProductForm.html");
		 pageBean = PageFactory.initElements(driver, AddProductPageBean.class);
	}

	@When("^User is trying to click on submit button without entering the productid$")
	public void user_is_trying_to_click_on_submit_button_without_entering_the_productid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 pageBean.clickSignUp();
	}

	@Then("^'Product Id should not be empty / length between \"([^\"]*)\" to \"\\+mx' message will be shown$")
	public void product_Id_should_not_be_empty_length_between_to_mx_message_will_be_shown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedAlertMessage ="Product Id should not be empty / length between 3 to 9";
		String actualAlertMessage=driver.switchTo().alert().getText();
		System.out.println(actualAlertMessage);
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to click on submit button without entering the productname$")
	public void user_is_trying_to_click_on_submit_button_without_entering_the_productname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		pageBean.setProductId("1001");
		pageBean.clickSignUp();
	}

	@Then("^'Name should not be empty / length be between \"([^\"]*)\" to \"\\+mini' message will be shown$")
	public void name_should_not_be_empty_length_be_between_to_mini_message_will_be_shown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedAlertMessage ="Name should not be empty / length be between 12 to 7";
		String actualAlertMessage=driver.switchTo().alert().getText();
		System.out.println(actualAlertMessage);
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to click on submit button without entering the productprice$")
	public void user_is_trying_to_click_on_submit_button_without_entering_the_productprice() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		pageBean.setProductId("1001");
		pageBean.setProductName("HideAndSeek");
		pageBean.clickSignUp();
	}

	@Then("^'Price should not be empty and must have Digits only' message will be shown$")
	public void price_should_not_be_empty_and_must_have_Digits_only_message_will_be_shown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedAlertMessage ="Price should not be empty and must have Digits only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		System.out.println(actualAlertMessage);
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to click on submit button without entering the store Addresss$")
	public void user_is_trying_to_click_on_submit_button_without_entering_the_store_Addresss() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		pageBean.setProductId("1001");
		pageBean.setProductName("HideAndSeek");
		pageBean.setProductPrice("5600");
		pageBean.clickSignUp();
	}

	@Then("^'Store address must have alphanumeric characters only' message will be shown$")
	public void store_address_must_have_alphanumeric_characters_only_message_will_be_shown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String expectedAlertMessage="Store address must have alphanumeric characters only";
	    String actualAlertMessage=driver.switchTo().alert().getText();
		System.out.println(actualAlertMessage);
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to click on submit button without entering the city$")
	public void user_is_trying_to_click_on_submit_button_without_entering_the_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		pageBean.setProductId("1001");
		pageBean.setProductName("HideAndSeek");
		pageBean.setProductPrice("5600");
		pageBean.setAddress("12Baghabazar");
		pageBean.clickSignUp();
	}

	@Then("^'Select your city from the list' message will be shown$")
	public void select_your_city_from_the_list_message_will_be_shown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String expectedAlertMessage="Select your city from the list";
	    String actualAlertMessage=driver.switchTo().alert().getText();
		System.out.println(actualAlertMessage);
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to click on submit button without entering the email-id$")
	public void user_is_trying_to_click_on_submit_button_without_entering_the_email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		pageBean.setProductId("1001");
		pageBean.setProductName("HideAndSeek");
		pageBean.setProductPrice("5600");
		pageBean.setAddress("12Baghabazar");
		pageBean.setCity("Hyderabad");
		pageBean.clickSignUp();
	}

	@Then("^'You have entered an invalid email address' message will be shown$")
	public void you_have_entered_an_invalid_email_address_message_will_be_shown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 String expectedAlertMessage="You have entered an invalid email address!";
		    String actualAlertMessage=driver.switchTo().alert().getText();
			System.out.println(actualAlertMessage);
			Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to click on submit button without entering the product category$")
	public void user_is_trying_to_click_on_submit_button_without_entering_the_product_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		pageBean.setProductId("1001");
		pageBean.setProductName("HideAndSeek");
		pageBean.setProductPrice("5600");
		pageBean.setAddress("12Baghabazar");
		pageBean.setCity("Hyderabad");
		pageBean.setEmail("dimpi.ghosh97@gmail.com");
		pageBean.clickSignUp();
	}

	@Then("^'Please Select Product category' message will be shown$")
	public void please_Select_Product_category_message_will_be_shown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedAlertMessage="Please Select Product category";
	    String actualAlertMessage=driver.switchTo().alert().getText();
		System.out.println(actualAlertMessage);
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request after entring valid set of information$")
	public void user_is_trying_to_submit_request_after_entring_valid_set_of_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		pageBean.setProductId("1001");
		pageBean.setProductName("HideAndSeek");
		pageBean.setProductPrice("5600");
		pageBean.setAddress("12Baghabazar");
		pageBean.setCity("Hyderabad");
		pageBean.setEmail("dimpi.ghosh97@gmail.com");
		pageBean.setProductCategory("Electronics");
		pageBean.clickSignUp();
	}

	@Then("^'Your Succesfully added a Product' alert message should display$")
	public void your_Succesfully_added_a_Product_alert_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String expectedAlertMessage="Your Succesfully added a Product ";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
		driver.switchTo().alert().dismiss();
	}
	@After
	public void tearDownStepEnv() {
		
		driver.close();
	}

}
