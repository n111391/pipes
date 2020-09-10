Feature: Google Search

Scenario Outline: Validate google search is working

	Given browser is open 
	And User is on google search page
	When user enters a <text> in searchbox
	And user hits enter
	Then user is navigated to search results page

Examples:
|text|
|naresh|
|kumar|
