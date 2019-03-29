#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add Product form

  Scenario: Add product with invalid set of field values
    Given User is on the Add-Product Page onBrowser
    When User is trying to click on submit button without entering the productid
    Then 'Product Id should not be empty / length between "+mini+" to "+mx' message will be shown
   
		When User is trying to click on submit button without entering the productname
    Then 'Name should not be empty / length be between "+mx+" to "+mini' message will be shown

 		When User is trying to click on submit button without entering the productprice
    Then 'Price should not be empty and must have Digits only' message will be shown
    
    When User is trying to click on submit button without entering the store Addresss
    Then 'Store address must have alphanumeric characters only' message will be shown
    
     When User is trying to click on submit button without entering the city
     Then 'Select your city from the list' message will be shown
      
      
      When User is trying to click on submit button without entering the email-id
      Then 'You have entered an invalid email address' message will be shown
      
       When User is trying to click on submit button without entering the product category
      Then 'Please Select Product category' message will be shown
    
 	  When  User is trying to submit request after entring valid set of information 
 	  Then 'Your Succesfully added a Product' alert message should display
