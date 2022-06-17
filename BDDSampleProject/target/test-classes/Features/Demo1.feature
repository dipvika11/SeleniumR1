#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Demofeature
Feature: Demo1 feature
  @chapter1
  Scenario: check chaptor1 link
    Given User is on page
    When User click on signin link
    And User Enter login details "dipvika11@gmail.com"  pasword "Dipvika11" and click on signin
    Then User should be logged in successfully.
    
    
