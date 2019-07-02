Feature: SignUp
Scenario Outline: Test SignUp with different input
Given user opens signup page
When user enters fn as "<firstname>"
And user enters ln as "<lastname>"
And user enters dob as "<dateofbrth>"
And user enters pwd as "<password>"
And user enters cpwd as "<confirmpassword>"
Then click SignUp button
And verify login success

Examples: 
|firstname|lastname|dateofbrth|password|confirmpassword|
|vedha|subbu|18/04/1997|vedha|vedha|
|vedha1|subbu1|18/04/1997|vedha|vedha|
