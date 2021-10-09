@AppLaunch
Feature: app launch scenarios
  Will verify if Baby Dots app is launching as expected

  @SmokeTest
  Scenario: User can launch Baby Dots app
    When an app is at the Baby Dots home screen
    Then title "Baby Dots" is shown on the screen