Feature: Login page testing

Scenario: Open main page and click in top bar links
	Given I open main page
	When I click link "SIGN-ON"
	Then I should see login page
