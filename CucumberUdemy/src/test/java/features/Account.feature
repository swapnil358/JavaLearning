Feature: Application login 

	
Background: 
Given validate the browser
When browser is triggered
Then check if browser is started



@SmokeTest
Scenario: Home page deafault login 
	Given User is not netbanking login page 
	When User login into application with "jin" and "123" 
	Then Home page is populated 
	And Cards displayed are "true" 


@RegTest
Scenario: Home page deafault login 
	Given User is not netbanking login page 
	When User login into application with "jin" and "123" 
	Then Home page is populated 
	And Cards displayed are "true" 
	
@SmokeTest	
Scenario: Home page deafault login 
	Given User is not netbanking login page 
	When User login into application with "john" and "12345" 
	Then Home page is populated 
	And Cards displayed are "true" 
	
	
@SmokeTest 
Scenario: Home page deafault login 
	Given User is not netbanking login page 
	When User sign up 
	| swap | bodade | India | swapnil.bodade@yahoo.com | maharstra |
	Then Home page is populated 
	And Cards displayed are "false" 
	
	