@AppLaunch
Feature: User can launch the app

Rule: User should see running app on the screen after app was launched

  @SmokeTest
  Scenario: User can launch Baby Dots app
    When an app is at the Baby Dots home screen
    Then title "Baby Dots" is shown on the screen