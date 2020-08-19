Feature: Social Media icon functionality

  Background: : Sign In functionality
    Given Navigate to "http://automationpractice.com/"
    When  Click Sign in button
    Then  Enter "abc1234@hotmail.com" as email and "1234abcd" as password
    Then  Click Submit Button

  @smoke
  Scenario:Facebook functionality
    Then  Click on "facebookIcon" on the right bottom corner
    And   Verify that URL contains "facebook.com"

  @smoke
  Scenario: Google functionality
    Then  Click on "googleIcon" on the right bottom corner
    And   Verify that URL contains "googl.com"

  @smoke
  Scenario: Twitter functionality
    Then  Click on "twitterIcon" on the right bottom corner
    And   Verify that URL contains "twitter.com"

  @smoke
  Scenario: Youtube functionality

    Then  Click on "youtubeIcon" on the right bottom corner
    And   Verify that URL contains "youtube.com"