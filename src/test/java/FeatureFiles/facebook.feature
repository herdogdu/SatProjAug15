Feature: Facebook icon functionality

  Scenario: Sign In functionality
    Given Navigate to "http://automationpractice.com/"
    When  Click Sign in button
    Then  Enter "abc1234@hotmail.com" as email and "1234abcd" as password
    Then  Click Submit Button
    Then  Click on "facebookIcon" on the right bottom corner
    And   Verify that URL contains "facebook.com"





