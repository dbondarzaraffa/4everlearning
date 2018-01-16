Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct 'username' and 'password'
    Given I go to the 'Login' page
    And I enter the following for Login
      | username | password     |
      | DimTest  | xxrpHdTRorrK |
    And I click the 'Sign In' button
    Then I should see the 'Avatar' picture

  Scenario: Login with correct 'username' and incorrect 'password'
    Given I go to the 'Login' page
    And I enter the following for Login
      | username | password          |
      | DimTest  | incorrectPassword |
    And I click the 'Sign In' button
    Then I should see the 'Incorrect login or password' text on the top of the 'Login' form

  Scenario: Login with correct 'password' and incorrect 'username'
    Given I go to the 'Login' page
    And I enter the following for Login
      | username          | password     |
      | incorrectUsername | xxrpHdTRorrK |
    And I click the 'Sign In' button
    Then I should see the 'Incorrect login or password' text on the top of the 'Login' form

  Scenario: Login with incorrect 'username' and incorrect 'password'
    Given I go to the 'Login' page
    And I enter the following for Login
      | username          | password          |
      | incorrectUsername | incorrectPassword |
    And I click the 'Sign In' button
    Then I should see the 'Incorrect login or password' text on the top of the 'Login' form

  Scenario: Click the 'Sign In' button with empty fields
    Given I go to the 'Login' page
    And I click the 'Sign In' button
    Then I should see the 'The field is required' text on the top of both fields