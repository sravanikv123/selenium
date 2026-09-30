@abc
Feature: OrangeHrmLogin

  @smoke
  Scenario Outline: OrangeHrm Login Validation without password
    Given open the OrangeHRM login page
    When enter the "<username>" and "<password>"
    And  click the login button
    Then validate the login scenario

    Examples:

      | username | password |
      | Admin    | admin123 |
      | Admin123 | admin123 |



