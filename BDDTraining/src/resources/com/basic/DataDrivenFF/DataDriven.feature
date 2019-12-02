Feature: TowerHobbie Sign In Feature 
  As a User I want to validate Sign In feature on TowerHobbie

Scenario Outline: Validate TowerH Sign In Scenario
Given User is on Tower site
When user enter "<Email>" Email
And user enter a "<Password>" Password
And User click Sign in button
Then Sign In successfully
Examples:
|Email										|Password	|
|rrampal@horizonhobby.com	|oda2014!	|