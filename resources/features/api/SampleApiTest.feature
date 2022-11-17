@api
Feature: Sample feature


  @api
  Scenario Outline: sample scenario
    When User submits a "post" request to "/create" endpoint with "<payload>" payload
    Then User receives 201 response code
    Examples:
      | payload                                         |
      | {\"name\":\"automation\", \"job\":\"engineer\"} |

  Scenario: Validation testing
    When User submits a "get" request to "/users" endpoint
    Then User receives 200 response code
    And  User verifies value at "data[0].id" is equals to 1

    #refere to "https://javadoc.io/doc/com.jayway.restassured/rest-assured/1.6.1/com/jayway/restassured/path/json/JsonPath.html" to
  # learn about JSonPath
  Scenario Outline: Post and validate scenario
    When User submits a "post" request to "/create" endpoint with "<payload>" payload
    Then User receives 201 response code
    When User submits a "get" request to "/users" endpoint
    Then User receives 200 response code
    And  User verifies value at "data[2].id" is equals to 3
    Examples:
      | payload                                |
      | {\"name\":\"scenario\", \"job\":\"3\"} |