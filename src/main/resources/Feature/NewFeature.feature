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
@tag
Feature: Test for Cucumber Test


  @tag1
  Scenario: Check title of Demo qa
    Given I am on chrome homepage
    When try to open demo qa url
    Then i am able to open demo qa url

  @tag2
  Scenario: New test 
    Given I want to write a step with precondition
    When I complete action
    Then I validate the outcomes
    Then check more outcomes

  
