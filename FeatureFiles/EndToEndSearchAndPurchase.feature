Feature: To Test Search, Add to Cart and Purchase functionality using Debit Card222

@Sanity @Regression @HighPriority
Scenario: 11Test Search, Add to Cart and Purchase functionality using Mastercard Valid Debit Card
Given User is on Login Page
When User enters username
And User enters password
And User clicks on signin button
Then Verify user should be login
And Verify user gets welcome message

@Regression @Nayak
Scenario: 22Test Search, Add to Cart and Purchase functionality using Mastercard InValid Debit Card
Given User is on Login Page
When User enters username
And User enters password
And User clicks on signin button
Then Verify user should be login
And Verify user gets welcome message


# Code Management - GIT(Github)
# Query Sessions