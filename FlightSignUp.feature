Feature: Flight Signup feature 
@Signup

Scenario: Check flight sign up functionlity 

Given I will open the browser with URL "https://flights.qedgetech.com/"
Then I  should see the resgister option
When I click on Register
Then I should see the Sign up page for register
When I want to enter the usere name as "Seeetha"
And I want to enter the mobile number "9896761898"
And I want to add the email id as "cdndmkjd@nike4s.com"
And I want to  add password as "Qedge123!@#"
And I want to select gender as "Male"
And I want to add date as "01-08-2022"
And I want to click on privacy policy
When I click on Register in Register page
Then I should see the Register Sccessfull message
When I close the browser