Feature: TowerHobbies Sign In Feature 
  As a User I want to validate Sign In feature on TowerHobbies

Scenario: Validate TowerH Sign In Scenario
Given User is on TowerH site
When Enter following data
	|Email Id									|Password	|Phone	|Email			|
	|rrampal@horizonhobby.com	|oda2014!	|79545	|rra@hh.com	|
When User Clicks Sign In
#Then User Sign In successfully
