Feature: Registration of the new user on sprortsdirect.com

  Scenario: Registration of the new user
    When I am on the home page
    And I close pop up message
    And I choose Men category
    And I choose Football Boots subcategory
    And I choose the first product
    And I select the first available size
    And I add to the bag the selected product
    And I answer No Thanks for personalization question
    And I proceed the checkout
    And I click the Continue Securely Button
    And I fill email field with "random" email and click the Continue Securely Button again
    And I fill the registration data with following information: "TestFirstName", "TestLastName", "Street", "Town", "LV3294", "12345678"
    And I select Standard Delivery method and click the Continue Securely Button again
    And I select the Credit Card Payment method
    And I fill Credit Card fields with following data: Credit Card number "1234567890123456", expiry date "11.20", Security Code "123" and click the Continue Securely Button again
    Then I verify that error with text: "Please enter a valid card number." is displayed