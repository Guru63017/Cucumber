Feature: Login to Nykaa

  Background: 
    Given user able to open the browser
    Then user able to enter the url on search bar
    And url launch successfully

  @Sanity
  Scenario: Login with valid credentials
    Then user able to enter the valid mail Id on input box
    And user able enter valid password on password input box
    Then user able to click on login and loggedin successfully

  @Smoke
  Scenario: Login with invalid credentials
    Then user able to enter the invalid mail Id on input box
    And user able enter invalid password on password input box
    Then user able to click on login and user unable to loggedin

  @Smoke
  Scenario: email input
    Then user able to enter the mail Id on input box
    Then user able to click on login
    And user experiance as invalid login alert
