Feature: Login intp Application

Scenario:Positive test validating login
Given Initialize the browser with chrome
And Navigate to "QAClickAcademy" site
And Click on Login link in Homepage to land on sign in page
When User enters "username" and "password" and logs in
Then Verify the user is succesfully logged in