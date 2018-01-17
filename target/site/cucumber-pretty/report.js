$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the login functionality of the application",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1036031,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct \u0027username\u0027 and \u0027password\u0027",
  "description": "",
  "id": "loginfeature;login-with-correct-\u0027username\u0027-and-\u0027password\u0027",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I go to the \u0027Login\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "DimTest",
        "xxrpHdTRorrK"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click the \u0027Sign In\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see the \u0027Avatar\u0027 picture",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iGoToThePage()"
});
formatter.result({
  "duration": 173793606,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "duration": 1900598,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickTheButton()"
});
formatter.result({
  "duration": 129805,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldSeeThePicture()"
});
formatter.result({
  "duration": 95392,
  "status": "passed"
});
formatter.after({
  "duration": 224594,
  "status": "passed"
});
formatter.before({
  "duration": 251763,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login with correct \u0027username\u0027 and incorrect \u0027password\u0027",
  "description": "",
  "id": "loginfeature;login-with-correct-\u0027username\u0027-and-incorrect-\u0027password\u0027",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I go to the \u0027Login\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15
    },
    {
      "cells": [
        "DimTest",
        "incorrectPassword"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click the \u0027Sign In\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see the \u0027Incorrect login or password\u0027 text on the top of the \u0027Login\u0027 form",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iGoToThePage()"
});
formatter.result({
  "duration": 428661,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "duration": 228820,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickTheButton()"
});
formatter.result({
  "duration": 195614,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheIncorrectLoginOrPasswordTextOnTheTopOfTheLoginForm()"
});
formatter.result({
  "duration": 287384,
  "status": "passed"
});
formatter.after({
  "duration": 504733,
  "status": "passed"
});
formatter.before({
  "duration": 486621,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Login with correct \u0027password\u0027 and incorrect \u0027username\u0027",
  "description": "",
  "id": "loginfeature;login-with-correct-\u0027password\u0027-and-incorrect-\u0027username\u0027",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I go to the \u0027Login\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 23
    },
    {
      "cells": [
        "incorrectUsername",
        "xxrpHdTRorrK"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click the \u0027Sign In\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see the \u0027Incorrect login or password\u0027 text on the top of the \u0027Login\u0027 form",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iGoToThePage()"
});
formatter.result({
  "duration": 409341,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "duration": 232443,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickTheButton()"
});
formatter.result({
  "duration": 184143,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheIncorrectLoginOrPasswordTextOnTheTopOfTheLoginForm()"
});
formatter.result({
  "duration": 191388,
  "status": "passed"
});
formatter.after({
  "duration": 3453437,
  "status": "passed"
});
formatter.before({
  "duration": 667745,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Login with incorrect \u0027username\u0027 and incorrect \u0027password\u0027",
  "description": "",
  "id": "loginfeature;login-with-incorrect-\u0027username\u0027-and-incorrect-\u0027password\u0027",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "I go to the \u0027Login\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 31
    },
    {
      "cells": [
        "incorrectUsername",
        "incorrectPassword"
      ],
      "line": 32
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click the \u0027Sign In\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I should see the \u0027Incorrect login or password\u0027 text on the top of the \u0027Login\u0027 form",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iGoToThePage()"
});
formatter.result({
  "duration": 473339,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "duration": 293421,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickTheButton()"
});
formatter.result({
  "duration": 607370,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheIncorrectLoginOrPasswordTextOnTheTopOfTheLoginForm()"
});
formatter.result({
  "duration": 8911316,
  "status": "passed"
});
formatter.after({
  "duration": 1931992,
  "status": "passed"
});
formatter.before({
  "duration": 1006448,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Click the \u0027Sign In\u0027 button with empty fields",
  "description": "",
  "id": "loginfeature;click-the-\u0027sign-in\u0027-button-with-empty-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "I go to the \u0027Login\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "I click the \u0027Sign In\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I should see the \u0027The field is required\u0027 text on the top of both fields",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iGoToThePage()"
});
formatter.result({
  "duration": 1193609,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickTheButton()"
});
formatter.result({
  "duration": 417190,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheTheFieldIsRequiredTextOnTheTopOfBothFields()"
});
formatter.result({
  "duration": 169050,
  "status": "passed"
});
formatter.after({
  "duration": 1634345,
  "status": "passed"
});
formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "RegistrationFeature",
  "description": "This feature deals with the registration functionality of the application",
  "id": "registrationfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1079501,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#"
    },
    {
      "line": 6,
      "value": "#  Correct registration"
    }
  ],
  "line": 8,
  "name": "Correct registration with entering valid data to every field",
  "description": "",
  "id": "registrationfeature;correct-registration-with-entering-valid-data-to-every-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I enter the randomly generated valid data to every field for registration",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see the message about email verification",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 3440758,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataToEveryFieldForRegistration()"
});
formatter.result({
  "duration": 2465705,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 548806,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iSeeTheMessageAboutEmailVerification()"
});
formatter.result({
  "duration": 171464,
  "status": "passed"
});
formatter.after({
  "duration": 298855,
  "status": "passed"
});
formatter.before({
  "duration": 436510,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Correct registration without entering data to \u0027Name\u0027 field",
  "description": "",
  "id": "registrationfeature;correct-registration-without-entering-data-to-\u0027name\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I enter the randomly generated valid data for registration without \u0027Name\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I see the message about email verification",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 564504,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutNameField()"
});
formatter.result({
  "duration": 3459474,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 245122,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iSeeTheMessageAboutEmailVerification()"
});
formatter.result({
  "duration": 185351,
  "status": "passed"
});
formatter.after({
  "duration": 164823,
  "status": "passed"
});
formatter.before({
  "duration": 438321,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 20,
      "value": "#"
    },
    {
      "line": 21,
      "value": "#"
    },
    {
      "line": 22,
      "value": "#    Incorrect registration with empty fields"
    }
  ],
  "line": 24,
  "name": "Click the \u0027Register\u0027 button with empty fields",
  "description": "",
  "id": "registrationfeature;click-the-\u0027register\u0027-button-with-empty-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I should see the \u0027The field is required\u0027 text on the top of \u0027username\u0027, \u0027subdomain\u0027, \u0027email\u0027 fields",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 1774415,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 694914,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iShouldSeeTheTheFieldIsRequiredTextOnTheTopOfUsernameSubdomainEmailFields()"
});
formatter.result({
  "duration": 2096815,
  "status": "passed"
});
formatter.after({
  "duration": 861548,
  "status": "passed"
});
formatter.before({
  "duration": 1014296,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 29,
      "value": "#"
    },
    {
      "line": 30,
      "value": "#"
    },
    {
      "line": 31,
      "value": "#    Incorrect registration: The \"Name\" field"
    }
  ],
  "line": 33,
  "name": "Registration with only one character in the \u0027Name\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-only-one-character-in-the-\u0027name\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "I enter only one character to the \u0027Name\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "The error message about number of characters should be displayed over the \u0027Name\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I enter the randomly generated valid data for registration without \u0027Name\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "The error message about number of characters should be displayed over the \u0027Name\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 900187,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterOnlyOneCharacterToTheNameField()"
});
formatter.result({
  "duration": 272894,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheNameField()"
});
formatter.result({
  "duration": 634539,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutNameField()"
});
formatter.result({
  "duration": 524053,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 109278,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheNameField()"
});
formatter.result({
  "duration": 597106,
  "status": "passed"
});
formatter.after({
  "duration": 244517,
  "status": "passed"
});
formatter.before({
  "duration": 1647627,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Registration with incorrect characters in the \u0027Name\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-incorrect-characters-in-the-\u0027name\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "I enter incorrect characters to the \u0027Name\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "The error message about correct characters should be displayed over the \u0027Name\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I enter the randomly generated valid data for registration without \u0027Name\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "The error message about correct characters should be displayed over the \u0027Name\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 5460898,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterIncorrectCharactersToTheNameField()"
});
formatter.result({
  "duration": 213123,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheNameField()"
});
formatter.result({
  "duration": 629105,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutNameField()"
});
formatter.result({
  "duration": 358022,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 134636,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheNameField()"
});
formatter.result({
  "duration": 622463,
  "status": "passed"
});
formatter.after({
  "duration": 1045087,
  "status": "passed"
});
formatter.before({
  "duration": 1414580,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Registration with spaces in the \u0027Name\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-spaces-in-the-\u0027name\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 50,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "I enter spaces to the \u0027Name\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "The error message about correct characters should be displayed over the \u0027Name\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I enter the randomly generated valid data for registration without \u0027Name\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "The error message about correct characters should be displayed over the \u0027Name\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 786080,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterSpacesToTheNameField()"
});
formatter.result({
  "duration": 195011,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheNameField()"
});
formatter.result({
  "duration": 174483,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutNameField()"
});
formatter.result({
  "duration": 1482200,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 3265672,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheNameField()"
});
formatter.result({
  "duration": 836190,
  "status": "passed"
});
formatter.after({
  "duration": 347155,
  "status": "passed"
});
formatter.before({
  "duration": 5233889,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 57,
      "value": "#"
    },
    {
      "line": 58,
      "value": "#"
    },
    {
      "line": 59,
      "value": "#    Incorrect registration: The \"Username\" field"
    }
  ],
  "line": 61,
  "name": "Registration with only one character in the \u0027Username\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-only-one-character-in-the-\u0027username\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 62,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "I enter only one character to the \u0027Username\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "The error message about number of characters should be displayed over the \u0027Username\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "I enter the randomly generated valid data for registration without \u0027Username\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "The error message about number of characters should be displayed over the \u0027Username\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 322402,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterOnlyOneCharacterToTheUsernameField()"
});
formatter.result({
  "duration": 657482,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheUsernameField()"
});
formatter.result({
  "duration": 648425,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutUsernameField()"
});
formatter.result({
  "duration": 539147,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 87544,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheUsernameField()"
});
formatter.result({
  "duration": 221575,
  "status": "passed"
});
formatter.after({
  "duration": 73657,
  "status": "passed"
});
formatter.before({
  "duration": 634539,
  "status": "passed"
});
formatter.scenario({
  "line": 69,
  "name": "Registration with incorrect characters in the \u0027Username\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-incorrect-characters-in-the-\u0027username\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 70,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 71,
  "name": "I enter incorrect characters to the \u0027Username\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "The error message about correct characters should be displayed over the \u0027Username\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "I enter the randomly generated valid data for registration without \u0027Username\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "The error message about correct characters should be displayed over the \u0027Username\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 1033616,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterIncorrectCharactersToTheUsernameField()"
});
formatter.result({
  "duration": 457640,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageCorrectCharactersShouldBeDisplayedOverTheUsernameField()"
});
formatter.result({
  "duration": 537939,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutUsernameField()"
});
formatter.result({
  "duration": 384587,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 133428,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageCorrectCharactersShouldBeDisplayedOverTheUsernameField()"
});
formatter.result({
  "duration": 1624685,
  "status": "passed"
});
formatter.after({
  "duration": 1179723,
  "status": "passed"
});
formatter.before({
  "duration": 393644,
  "status": "passed"
});
formatter.scenario({
  "line": 77,
  "name": "Registration with spaces in the \u0027Username\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-spaces-in-the-\u0027username\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 78,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 79,
  "name": "I enter username with SPACES to the \u0027Username\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "The error message about correct characters should be displayed over the \u0027Username\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "I enter the randomly generated valid data for registration without \u0027Username\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "The error message about correct characters should be displayed over the \u0027Username\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 382776,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterUsernameWithSPACESToTheUsernameField()"
});
formatter.result({
  "duration": 177502,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageCorrectCharactersShouldBeDisplayedOverTheUsernameField()"
});
formatter.result({
  "duration": 164823,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutUsernameField()"
});
formatter.result({
  "duration": 383984,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 167842,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageCorrectCharactersShouldBeDisplayedOverTheUsernameField()"
});
formatter.result({
  "duration": 237273,
  "status": "passed"
});
formatter.after({
  "duration": 135843,
  "status": "passed"
});
formatter.before({
  "duration": 393039,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 85,
      "value": "#"
    },
    {
      "line": 86,
      "value": "#"
    },
    {
      "line": 87,
      "value": "#    Incorrect registration: The \"Subdomain\" field"
    }
  ],
  "line": 89,
  "name": "Registration with only one character in the \u0027Subdomain\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-only-one-character-in-the-\u0027subdomain\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 90,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 91,
  "name": "I enter only one character to the \u0027Subdomain\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "The error message about number of characters should be displayed over the \u0027Subdomain\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "I enter the randomly generated valid data for registration without \u0027Subdomain\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "The error message about number of characters should be displayed over the \u0027Subdomain\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 2408954,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterOnlyOneCharacterToTheSubdomainField()"
});
formatter.result({
  "duration": 239084,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheSubdomainField()"
});
formatter.result({
  "duration": 204067,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutSubdomainField()"
});
formatter.result({
  "duration": 283761,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 89959,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheSubdomainField()"
});
formatter.result({
  "duration": 1066218,
  "status": "passed"
});
formatter.after({
  "duration": 181728,
  "status": "passed"
});
formatter.before({
  "duration": 6903252,
  "status": "passed"
});
formatter.scenario({
  "line": 97,
  "name": "Registration with incorrect characters in the \u0027Subdomain\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-incorrect-characters-in-the-\u0027subdomain\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 98,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 99,
  "name": "I enter incorrect characters to the \u0027Subdomain\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "The error message about correct characters should be displayed over the \u0027Subdomain\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "I enter the randomly generated valid data for registration without \u0027Subdomain\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "The error message about correct characters should be displayed over the \u0027Subdomain\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 734761,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterIncorrectCharactersToTheSubdomainField()"
});
formatter.result({
  "duration": 1048710,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheSubdomainField()"
});
formatter.result({
  "duration": 434095,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutSubdomainField()"
});
formatter.result({
  "duration": 562692,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 191991,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheSubdomainField()"
});
formatter.result({
  "duration": 257800,
  "status": "passed"
});
formatter.after({
  "duration": 2098627,
  "status": "passed"
});
formatter.before({
  "duration": 2524873,
  "status": "passed"
});
formatter.scenario({
  "line": 105,
  "name": "Registration with spaces in the \u0027Subdomain\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-spaces-in-the-\u0027subdomain\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 106,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 107,
  "name": "I enter subdomain name with SPACES to the \u0027Subdomain\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "The error message about correct characters should be displayed over the \u0027Subdomain\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "I enter the randomly generated valid data for registration without \u0027Username\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 111,
  "name": "The error message about correct characters should be displayed over the \u0027Subdomain\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 3867004,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterSubdomainNameWithSPACESToTheSubdomainField()"
});
formatter.result({
  "duration": 969015,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheSubdomainField()"
});
formatter.result({
  "duration": 433491,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutUsernameField()"
});
formatter.result({
  "duration": 246933,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 435302,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheSubdomainField()"
});
formatter.result({
  "duration": 301270,
  "status": "passed"
});
formatter.after({
  "duration": 606163,
  "status": "passed"
});
formatter.before({
  "duration": 1106670,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 113,
      "value": "#"
    },
    {
      "line": 114,
      "value": "#"
    },
    {
      "line": 115,
      "value": "#    Incorrect registration: The \"Email\" field"
    }
  ],
  "line": 117,
  "name": "Registration with only one character in the \u0027Email\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-only-one-character-in-the-\u0027email\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 118,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 119,
  "name": "I enter only one character to the \u0027Email\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "The error message about number of characters should be displayed over the \u0027Email\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "I enter the randomly generated valid data for registration without \u0027Email\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "The error message about number of characters should be displayed over the \u0027Email\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 4167670,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterOnlyOneCharacterToTheEmailField()"
});
formatter.result({
  "duration": 3394269,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheEmailField()"
});
formatter.result({
  "duration": 1200251,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutEmailField()"
});
formatter.result({
  "duration": 1554046,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 255989,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheEmailField()"
});
formatter.result({
  "duration": 477564,
  "status": "passed"
});
formatter.after({
  "duration": 295836,
  "status": "passed"
});
formatter.before({
  "duration": 3419023,
  "status": "passed"
});
formatter.scenario({
  "line": 125,
  "name": "Registration with incorrect characters in the \u0027Email\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-incorrect-characters-in-the-\u0027email\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 126,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 127,
  "name": "I enter incorrect characters to the \u0027Email\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "The error message about correct characters should be displayed over the \u0027Email\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 129,
  "name": "I enter the randomly generated valid data for registration without \u0027Email\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 130,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 131,
  "name": "The error message about correct characters should be displayed over the \u0027Email\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 380965,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterIncorrectCharactersToTheEmailField()"
});
formatter.result({
  "duration": 179917,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheEmailField()"
});
formatter.result({
  "duration": 177501,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutEmailField()"
});
formatter.result({
  "duration": 220368,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 201652,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheEmailField()"
});
formatter.result({
  "duration": 174483,
  "status": "passed"
});
formatter.after({
  "duration": 2633548,
  "status": "passed"
});
formatter.before({
  "duration": 501111,
  "status": "passed"
});
formatter.scenario({
  "line": 133,
  "name": "Registration with spaces in the \u0027Email\u0027 field",
  "description": "",
  "id": "registrationfeature;registration-with-spaces-in-the-\u0027email\u0027-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 134,
  "name": "I go to the \u0027Registration\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 135,
  "name": "I enter email with SPACES to the \u0027Email\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 136,
  "name": "The error message about correct characters should be displayed over the \u0027Subdomain\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 137,
  "name": "I enter the randomly generated valid data for registration without \u0027Username\u0027 field",
  "keyword": "And "
});
formatter.step({
  "line": 138,
  "name": "I click the \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 139,
  "name": "The error message about correct characters should be displayed over the \u0027Subdomain\u0027 field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.iGoToTheRegistrationPage()"
});
formatter.result({
  "duration": 636350,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterEmailWithSPACESToTheEmailField()"
});
formatter.result({
  "duration": 242103,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheSubdomainField()"
});
formatter.result({
  "duration": 327231,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutUsernameField()"
});
formatter.result({
  "duration": 271082,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.iClickTheRegisterButton()"
});
formatter.result({
  "duration": 77884,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheSubdomainField()"
});
formatter.result({
  "duration": 67016,
  "status": "passed"
});
formatter.after({
  "duration": 54941,
  "status": "passed"
});
});