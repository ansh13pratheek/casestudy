Feature: TestMeApp

Scenario Outline: TestMeApp Registration
Given Clicks SignUp to Register
When Enters username "<username>"
When Enters firstname "<firstname>"
When Enters lastname "<lastname>"
When Enters password "<password>"
When Enters con_password "<con_password>"
When Select radio male
When Enters email "<email>"
When Enters mobile "<mobile>"
When Enters dob "<dob>"
When Enters address "<address>"
When Select a secque
When Enters answer "<answer>"
When Clicks on Register
Then Registers Succesfully message

Examples:
	|username|firstname|lastname|password|con_password|email				|mobile			|dob				|address		|answer|
	|catbro12|ks	     |anshcat |anshprat|anshprat|ksa@gmail.com|9916156687	|09/09/1999	|ansh layout|purvj |