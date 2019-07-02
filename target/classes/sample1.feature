Feature: Login Test
Description: Regsitered user can login into application using valid username and password
Scenario: Login with valid combination
Given user opens login page in newtorurs application
When user enters username as "mercury" And password as "mercury" And click Submit button
Then verify login sucess 