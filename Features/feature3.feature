Feature: GmailLogin

@smoke
  Scenario: Login with valid credentials
   Given user able to open the browser
   Then user able to enter the url on search bar
   And url launch successfully
   Then user able to enter the mail Id on input box
   And user able enter password on password input box
   Then user able to click on login and loggedin successfully
   
   @smoke
   Scenario: Login with invalid credentials
   Given user able to open the browser
   Then user able to enter the url on search bar
   And url launch successfully
   Then user able to enter the invalid mail Id on input box
   And user able enter invalid password on password input box
   Then user able to click on login and user unable to loggedin
   
   @sanity
   Scenario: email input 
   Given user able to open the browser
   Then user able to enter the url on search bar
   And url launch successfully
   Then user able to enter the mail Id on input box
   Then user able to click on login
   And user experiance as invalid login alert
   
   @sanity
   Scenario: password input 
   Given user able to open the browser
   Then user able to enter the url on search bar
   And url launch successfully
   Then user able to enter the password on input box
   Then user able to click on login
   And user experiance as invalid login alert with only password
   
   @Regression
   Scenario: click on login with out credentials 
   Given user able to open the browser
   Then user able to enter the url on search bar
   And url launch successfully
   Then user click on login without any credentials
   Then user experiance as invalid login alert without credentials
  
   

 