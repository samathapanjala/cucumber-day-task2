@tag
Feature: Add customer
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Generate an customer ID
    Given User should launch browser
    And User click add customer link
    When user provide valid details "<fname>","<lname>","<email>","<address>","<phoneno>"
    Then To verify the customer id is displayed
    

 Examples:
   
      |fname  | lname | email |address|phoneno|
      | ram   |krishna| panjaiaramakrishna@gmail.com |warangal|8754550484|
      | samatha|panjala|godishala.samatha23@gmail.com|karimnagag |9642752712|
      |raj|godishala|sriraj@gmail.com|venkepally|9739383719|