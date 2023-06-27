Feature: Test booking

  Scenario: I try to close login view
    Given I am in login view
    When I close this view
    Then I am in booking View

  Scenario: I try navigate to Booking View
    Given I navigate to booking View
    When I enter search button
    Then Im in Booking interface

  Scenario: I try looking for a destination
#    Given Im in Booking interface
    When I enter criteria on destination
    And I select dates and persons
    Then I am in results interface

  Scenario: I chose booking
    When I chose 2nd option
