Feature: login

@login
Scenario Outline:verify funcality of login 
Given user launch an chromebrowser 
And user navigate to practicetestautomation 
When Enter "<Username>" in User NameField.
And Enter "<Password>" in Password Field.
And User click on submit button.
Then Verify User login or not by "<title>".
 
 Examples:
 |Username|Password|title|
 |Student |Password123|Logged In successfully |
 |demo|Pass2343|test login|
 