Feature:Search and place order for vegetables

@SmokeTest
Scenario:Search for items and validate results
Given user is on Green cart Landing page
When user searched for Cucumber vegetables
Then "Cucumber" results should display
//this is smoke test

@RegressionTest
Scenario Outline:Search for items and place order for vegetables
Given user is on Green cart Landing page
When user searched for <Name> vegetables
And item added to cart
And proceed to checkout page for purchase
Then verify <Name> are displyed in checkout page

Examples:
|Name   |
|Brinjal|
|Beetroot|

//this is parametrisation