Feature: search multiple items
Scenario: Search products
When user searches for products
|iphone|
|handbag|
|headphone|
And verify products displayed
Then close