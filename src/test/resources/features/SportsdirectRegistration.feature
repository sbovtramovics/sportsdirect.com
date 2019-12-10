Feature: Registration of the new user on sprortsdirect.com
  Scenario: Registration of the new user
    When I am on the home page
    And I click Sign In button
    And I click new user registration button
    And I fill the registration data with following information: "TestFirstName", "TestLastName", "random", "23.10.1980", "password123!"
    And I click submit registration button
    Then I verify that reCaptcha is previewed


