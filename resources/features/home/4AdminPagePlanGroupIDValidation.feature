Feature: login to application and click on csv and excel file
  Background:
   #Login page
    Given login to application "gnaneswari.kaki@citizensbank.com","Yellow@123"
  @TC4
  Scenario:
    Then Click on Admin page
    And Click on plangroup id click here button
    And validate record size




