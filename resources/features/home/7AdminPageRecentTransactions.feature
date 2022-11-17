Feature: login to application and click on csv and excel file
  Background:
   #Login page
    Given login to application "gnaneswari.kaki@citizensbank.com","Yellow@123"
  @TC7
  Scenario:
    Then Click on Admin page
    And Click on Recent Transactions click button
    And validate record size






