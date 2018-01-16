Feature: RegistrationFeature
  This feature deals with the registration functionality of the application

  Scenario: Correct registration with entering valid data to every field
    Given I go to the 'Registration' page
    And I enter the randomly generated valid data to every field for registration
    And I click the 'Register' button
    Then I see the message about email verification

  Scenario: Correct registration without entering data to 'Name' field
    Given I go to the 'Registration' page
    And I enter the randomly generated valid data for registration without 'Name' field
    And I click the 'Register' button
    Then I see the message about email verification

  Scenario: Click the 'Register' button with empty fields
    Given I go to the 'Registration' page
    And I click the 'Register' button
    Then I should see the 'The field is required' text on the top of 'username', 'subdomain', 'email' fields