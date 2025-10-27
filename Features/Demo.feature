Feature: Login
 Scenario: Validation functionality of login by using valid data.
 Given Launch an ChromeBrowser.
 And Navigate to ThaneMuncipalCorporation
 When User Enter "Dilip.Suryavanshi" in UserID field.
 And User Enter "Pass@123" in password field.
 And user select Thane Muncipal Corportaion from the select organisation dropdown.
 And user click on sumbit button.
 Then Validation of login by url and title.
 And close the ChromeBrowser.
 