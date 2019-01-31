
Feature: Check if the vehicle exists with respect to the registration number provided

 Scenario: Valid and Available Vehicle Registration Number
  Given Open the website and start the application
  When  Enter the vehicle registration number 
  And   Click on Find Vehicle
  Then  I get the message as Vechile Exists
  
 
  
  

