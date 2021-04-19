
Feature: checking the login functionality


  Scenario Outline: Login Check
  Given user is in website
  When User enter valid <username> and <password>
  Then User lands in home page
Examples:

|username|password|
|viji|12345|
|dharun|12345|