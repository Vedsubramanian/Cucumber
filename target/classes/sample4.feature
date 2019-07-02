Feature: Background test
Background: display Welcome
Given application displays welcome msg

@smoke @regression
Scenario: SignIn
Given uname and pwd
And click signin button
@regression
Scenario: Search for product
When user searches for iphone
@regression
Scenario: Add to cart
When user adds product to cart
@smoke
Scenario: payment process
When user performs payment using netbanking
@smoke @regression
Scenario: Signout
When user signs out from site