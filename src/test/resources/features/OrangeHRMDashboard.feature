@xyz
Feature: OrangeHrmDashboard

  Background:
    And open the OrangeHRM login page
    When enter the 'Admin' and 'admin123'
    And  click the login button


  @sanity
  Scenario: OrangeHrm Admin page
    And click the admin tab
    Then validate the admin scenario


  @sanity
  Scenario: OrangeHrm Pim page
    And click the pim tab

