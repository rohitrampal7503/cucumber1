Feature: TowerHobbies Sign In Feature 
  As a User I want to validate Sign In feature on TowerHobbies

Background: Common Login Steps
Given User is on TowerH site

Scenario: Validate TowerH Sign In First Name Scenario
When User enters "rrampal@horizonhobby.com" Email Id
Then User Email is present

Scenario: Validate TowerH Sign In Last Name Scenario
When User enters "oda2014!" password1
Then User password is present