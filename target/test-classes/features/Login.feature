Feature: Login Feature

  Background:
    Given User launches the application

  Scenario: Valid Login
    When User enters username "Admin" and password "admin123"
    And User clicks login button
    Then User should see dashboard

  Scenario: Invalid Login
    When User enters username "Admin" and password "wrongpass"
    And User clicks login button
    Then User should see error message
