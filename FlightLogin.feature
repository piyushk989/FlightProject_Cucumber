Feature: Login Functionality Feature

 	
In order to check the login functionality,I want to run cucumber test to verify its working
  	 
@SignIn
Scenario: Check Login Functionality

Given i  launch the browser with URL "https://flights.qedgetech.com/"
Then  i should see the login page
When  i enter  email as "praveen@qedgetech.com"
And   i enter  password as "Qedge123"
And   i  click on login button
Then  i should see the  user dashboard
When  i click Logout
Then  i should see the login page
When  i close the browser