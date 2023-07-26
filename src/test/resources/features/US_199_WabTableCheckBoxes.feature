@B29G2-212
Feature: Default

	#User Story: 
	#
	#As a user, I should be able to select any vehicle from the Vehicle page
	#
	# 
	#
	#{color:#de350b}*AC #1:*  {color}once the users launch on the Vehicle page, all the checkboxes should be unchecked{*}.{*}
	#
	# 
	@B29G2-208
	Scenario: once the users launch on the Vehicle page, all the checkboxes should be unchecked.
			Given user is on the login page
		    Then user enters the store manager information
		    When user launch on the Vehicle page
		    Then user hover over on the Fleet
		    And user click on Vehicles
		    And all the checkboxes should be unchecked	

	#user story:
	#
	#As a user, I should be able to select any vehicle from the Vehicle page
	#
	# 
	#
	#{color:#de350b}*AC #2:*{color} ** user checks the first checkbox to check all the cars
	@B29G2-209
	Scenario: user checks the first checkbox to check all the cars
			Given user is on the login page
		    Then user enters the store manager information
		    When user click on the first checkbox
		    Then user should be able to check all the boxes	

	#User Story:
	#
	#As a user, I should be able to select any vehicle from the Vehicle page
	#
	# 
	#
	#{color:#de350b}*AC #3:*{color} ** users can select any car
	@B29G2-210
	Scenario:  users can select any car
			Given user is on the login page
		    Then user enters the store manager information
		    Given user is able to select any car