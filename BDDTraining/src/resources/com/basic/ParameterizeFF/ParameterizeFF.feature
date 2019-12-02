Feature: TowerHobbies Sign In Feature 
  As a User I want to validate Sign In feature on TowerHobbies

Scenario: Validate TowerH Sign In First Name Scenario
Given User is on TowerH site
When User enters "rrampal@horizonhobby.com" Email Id
Then User Email is present

Scenario: Validate TowerH Sign In Last Name Scenario
Given User is on TowerH site
When User enters "oda2014!" password
Then User password is present