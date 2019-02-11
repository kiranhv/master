Feature: Test Facebook Smoke Scenarios

  Scenario Outline: Test Login with valid credential
    Given Open Chrome URL
    When I Enter valid "<username>" and valid "<password>"
    Then User should be able to login successfully
    Then Close the browser

    Examples: 
      | username          | password |
      | ramesh1@gmail.com | abcd1    |
      | suresh2@gmail.com | xyz2     |
