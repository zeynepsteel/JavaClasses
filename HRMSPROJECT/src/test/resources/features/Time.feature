Feature: Timesheet

Background:
Given I am logged into HRMS 
And I navigated to Timesheet menu

Scenario: View emloyee timesheet

When I enter employee name
Then I click view
And I see error message
@smoke
Scenario: Add Timesheet


When I see No Timesheets found text
And i click add timesheet
Then I select a day to create Timesheet
And I click add timesheet button
