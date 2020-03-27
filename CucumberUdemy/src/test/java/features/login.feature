Feature: Application login 


Background: 
Given validate the browser
When browser is triggered
Then check if browser is started

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
	
	
@RegTest
Scenario Outline: Home page deafault login 
	Given User is not netbanking login page 
	When User login in to application with <Username> and <Password> 
	Then Home page is populated 
	And Cards displayed are "true" 
	
	Examples: 
		|Username|Password|
		|user1	 |pass1   |
		|user2	 |pass2   |
		|user3	 |pass3   |
		|user4	 |pass4   |