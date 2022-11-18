
Feature:  NHS costs checket tool
  
  Background:
  Given Open the browser with url

  @regression @EndToEnd
  Scenario: Verify the NHS paying costs for England recident
    Given I am a England recident
    When England recident put circumstances into the checker tool
    Then England recident should get a result of whether will get help or not
    
  @regression @EndToEnd
   Scenario: Verify the NHS paying costs for Scotland recident
    Given I am a Scotland recident
    When Scotland recident put circumstances into the checker tool
    Then Scotland recident should get a result of whether I will get help or not
  
  @regression 
   Scenario: Verify the NHS paying costs for Wales recident
    Given I am a Wales recident
    When Wales recident put circumstances into the checker tool 
    Then Wales recident I should get a result of whether I will get help or not
    
  
  @regression @smoke
  Scenario: Verify the NHS paying costs for ireland recident
    Given I am a Ireland recident
    When Ireland recident put circumstances into the checker tool 
    Then Ireland recident should get a result of whether I will get help or not
  
    
    
    