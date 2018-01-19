Feature: RegistrationFeature
  This feature deals with the registration functionality of the application

#
#
#  Correct registration

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

#
#
#    Incorrect registration with empty fields

  Scenario: Click the 'Register' button with empty fields
    Given I go to the 'Registration' page
    And I click the 'Register' button
    Then I should see the 'The field is required' text on the top of 'username', 'subdomain', 'email' fields

#
#
#    Incorrect registration: The "Name" field

  Scenario: Registration with only one character in the 'Name' field
    Given I go to the 'Registration' page
    And I enter only one character to the 'Name' field
    And I enter the randomly generated valid data for registration without 'Name' field
    And I click the 'Register' button
    Then The error message about number of characters should be displayed over the 'Name' field

  Scenario: Registration with incorrect characters in the 'Name' field
    Given I go to the 'Registration' page
    And I enter incorrect characters to the 'Name' field
    And I enter the randomly generated valid data for registration without 'Name' field
    And I click the 'Register' button
    Then The error message about correct characters should be displayed over the 'Name' field

#  Scenario: Registration with spaces in the 'Name' field
#    Given I go to the 'Registration' page
#    And I enter spaces to the 'Name' field
#    And I enter the randomly generated valid data for registration without 'Name' field
#    And I click the 'Register' button
#    Then The error message about correct characters should be displayed over the 'Name' field

#
#
#    Incorrect registration: The "Username" field

#  Scenario: Registration with only one character in the 'Username' field
#    Given I go to the 'Registration' page
#    And I enter only one character to the 'Username' field
#    And The error message about number of characters should be displayed over the 'Username' field
#    And I enter the randomly generated valid data for registration without 'Username' field
#    And I click the 'Register' button
#    Then The error message about number of characters should be displayed over the 'Username' field
#
#  Scenario: Registration with incorrect characters in the 'Username' field
#    Given I go to the 'Registration' page
#    And I enter incorrect characters to the 'Username' field
#    And The error message about correct characters should be displayed over the 'Username' field
#    And I enter the randomly generated valid data for registration without 'Username' field
#    And I click the 'Register' button
#    Then The error message about correct characters should be displayed over the 'Username' field
#
#  Scenario: Registration with spaces in the 'Username' field
#    Given I go to the 'Registration' page
#    And I enter username with SPACES to the 'Username' field
#    And The error message about correct characters should be displayed over the 'Username' field
#    And I enter the randomly generated valid data for registration without 'Username' field
#    And I click the 'Register' button
#    Then The error message about correct characters should be displayed over the 'Username' field

#
#
#    Incorrect registration: The "Subdomain" field

#  Scenario: Registration with only one character in the 'Subdomain' field
#    Given I go to the 'Registration' page
#    And I enter only one character to the 'Subdomain' field
#    And The error message about number of characters should be displayed over the 'Subdomain' field
#    And I enter the randomly generated valid data for registration without 'Subdomain' field
#    And I click the 'Register' button
#    Then The error message about number of characters should be displayed over the 'Subdomain' field
#
#  Scenario: Registration with incorrect characters in the 'Subdomain' field
#    Given I go to the 'Registration' page
#    And I enter incorrect characters to the 'Subdomain' field
#    And The error message about correct characters should be displayed over the 'Subdomain' field
#    And I enter the randomly generated valid data for registration without 'Subdomain' field
#    And I click the 'Register' button
#    Then The error message about correct characters should be displayed over the 'Subdomain' field
#
#  Scenario: Registration with spaces in the 'Subdomain' field
#    Given I go to the 'Registration' page
#    And I enter subdomain name with SPACES to the 'Subdomain' field
#    And The error message about correct characters should be displayed over the 'Subdomain' field
#    And I enter the randomly generated valid data for registration without 'Username' field
#    And I click the 'Register' button
#    Then The error message about correct characters should be displayed over the 'Subdomain' field

#
#
#    Incorrect registration: The "Email" field

#  Scenario: Registration with only one character in the 'Email' field
#    Given I go to the 'Registration' page
#    And I enter only one character to the 'Email' field
#    And The error message about number of characters should be displayed over the 'Email' field
#    And I enter the randomly generated valid data for registration without 'Email' field
#    And I click the 'Register' button
#    Then The error message about number of characters should be displayed over the 'Email' field
#
#  Scenario: Registration with incorrect characters in the 'Email' field
#    Given I go to the 'Registration' page
#    And I enter incorrect characters to the 'Email' field
#    And The error message about correct characters should be displayed over the 'Email' field
#    And I enter the randomly generated valid data for registration without 'Email' field
#    And I click the 'Register' button
#    Then The error message about correct characters should be displayed over the 'Email' field
#
#  Scenario: Registration with spaces in the 'Email' field
#    Given I go to the 'Registration' page
#    And I enter email with SPACES to the 'Email' field
#    And The error message about correct characters should be displayed over the 'Subdomain' field
#    And I enter the randomly generated valid data for registration without 'Username' field
#    And I click the 'Register' button
#    Then The error message about correct characters should be displayed over the 'Subdomain' field