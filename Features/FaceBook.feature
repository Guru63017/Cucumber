Feature: Facebook login

  Background: 
    Given Launch the browser
    Then Enter the facebook url

  Scenario: Facebook login using credentials
    Then Click username input box and enter username
    Then Click on password input box and enter password
    Then Click on Login
