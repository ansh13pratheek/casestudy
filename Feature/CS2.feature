Feature: TestMeApp Login

Scenario Outline: TestMeApp Login Test
Given The Login page is opened
When User Enters the username"<username>"
When User Enters the password"<password>"
Then The home page is opened

Examples:
	|username|password|
	|catbro12|anshprat|