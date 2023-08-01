@B29G2-226
Feature:As a user, I want to see edit car info icons from the Vehicle page.
	User Story :  As a user, I want to see edit car info icons from the Vehicle page.

	#{color:#de350b}*User Story* :{color}  As a user, I want to see edit car info icons from the Vehicle page.
	#
	# 
	#
	#{color:#de350b}*AC #1:*  {color}users should see “{*}view, edit, delete{*}” when they hover the mouse over the 3 dots “…” 
	@B29G2-225
	Scenario: I want to see edit car info icons from the Vehicle page
		Given user is on the login page
		When user enters the store manager information
		And user hover over on the Fleet
		And user click on vehicle
		And user must see 3 dot"..." far right of the page
		Then users should see “view, edit, delete” icons
#      There is a abnormal things on last step.All the functions working well.I checked with manually and it passed.But with automation i could not