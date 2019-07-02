Feature: Login Testt
Description: Regsitered user can login into application using valid username and password
Scenario: Login with valid combination
Given user opens login page in newtorurs application
When user enters username as "mercury" And password as "mercury"
 And click Submit button
Then verify login sucess 

Scenario: Login with invalid combination
Given user opens login page in newtorurs application
When user enters username as "vedha" And password as "vedha"
 And click Submit button
Then verify login failure 